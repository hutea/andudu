package com.hydom.base.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hydom.base.ebean.User;
import com.hydom.base.service.UserService;
import com.hydom.dao.PageView;

@Controller
@RequestMapping("/manage/user")
public class UserServlet {
	@Resource
	private UserService userService;

	private int maxresult = 5;

	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(required = false, defaultValue = "1") int page) {
		PageView<User> pageView = new PageView<User>(maxresult, page);
		
		ModelAndView mav = new ModelAndView("user/user_list");
		mav.addObject("pageView", pageView);
		mav.addObject("page", page);
		mav.addObject("m", 1);
		return mav;
	}

	@RequestMapping("/new")
	public ModelAndView addUI() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		List<String> orderList = new ArrayList<String>();
		orderList.add("lv desc");
		ModelAndView mav = new ModelAndView("/user/user_new");
		return mav;
	}

	@RequestMapping("/save")
	public ModelAndView add(@ModelAttribute User user, @RequestParam String uid) {
		ModelAndView mav = new ModelAndView("redirect:list");
		return mav;
	}

	@RequestMapping("/edit/{bid}")
	public ModelAndView editUI(@PathVariable String bid) {
		ModelAndView mav = new ModelAndView("user/user_edit");
		return mav;
	}

	@RequestMapping("/update")
	public ModelAndView edit(@ModelAttribute User user, @RequestParam String uid,
			@RequestParam String tid) {
		ModelAndView mav = new ModelAndView("redirect:list");
		return mav;
	}

	@RequestMapping("/delete")
	public @ResponseBody
	int del(@RequestParam int uid) {
		int res = 1;
		try {
			userService.delete(uid);
		} catch (Exception e) {
			res = 0;
		}
		return res;
	}
}
