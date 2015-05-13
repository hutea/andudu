package com.hydom.base.control;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hydom.base.ebean.User;
import com.hydom.util.HelpUtil;
import com.hydom.util.StringUtil;

@Controller
@RequestMapping("/manage/news")
public class NewsServlet {
	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/new")
	public ModelAndView addUI() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		List<String> orderList = new ArrayList<String>();
		orderList.add("lv desc");
		ModelAndView mav = new ModelAndView("/base/news_add");
		return mav;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody
	String upload(@RequestParam(value = "file", required = false) MultipartFile upload) {
		String oriname = upload.getOriginalFilename();
		String suffix = oriname.substring(oriname.lastIndexOf("."));
		String filePath = "resource/" + StringUtil.generatorID() + "-TEMP" + suffix;
		File tempFile = new File(request.getSession().getServletContext().getRealPath(filePath));
		try {
			FileUtils.copyInputStreamToFile(upload.getInputStream(), tempFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}

	@RequestMapping("/save")
	public ModelAndView add(@ModelAttribute User user, @RequestParam String uid) {
		ModelAndView mav = new ModelAndView("redirect:list");
		return mav;
	}

}
