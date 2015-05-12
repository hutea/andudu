package com.hydom.base.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hydom.base.ebean.User;

@Controller
@RequestMapping("/user")
public class UserFrontServlet {

	@RequestMapping("/signup")
	public ModelAndView addUI(@ModelAttribute User user, @RequestParam String uid) {
		
		ModelAndView mav = new ModelAndView("user/user_edit");
		return mav;
	}

	/**
	 * 验证用户名是否存在
	 * 
	 * @return 存在返回true，不存在返回false
	 */
	@RequestMapping("/verify/username")
	public @ResponseBody
	boolean verifyUsername(@RequestParam String username) {
		return true;
	}

	/**
	 * 发送验证码
	 * 
	 * @param username
	 * @return 发送成功返回true，否则返回false
	 */
	@RequestMapping("/send/code")
	public @ResponseBody
	boolean sendCode(@RequestParam String username) {
		return true;
	}

	@RequestMapping("/save")
	public @ResponseBody
	String add(@ModelAttribute User user) {
		return "";
	}

}
