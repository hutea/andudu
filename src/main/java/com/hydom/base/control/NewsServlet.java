package com.hydom.base.control;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
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

import com.hydom.base.ebean.News;
import com.hydom.base.service.NewsService;
import com.hydom.dao.PageView;
import com.hydom.util.StringUtil;
import com.hydom.util.WebUtil;

@Controller
@RequestMapping("/manage/news")
public class NewsServlet {
	@Resource
	private NewsService newsService;
	@Autowired
	private HttpServletRequest request;
	private int maxresult = 10 ;

	@RequestMapping("/new/list")
	public ModelAndView list(@RequestParam(value = "file", required = false) int page) {
		PageView<News> pageView = new PageView<News>(maxresult, page);
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("id", "desc");
		StringBuffer jpql = new StringBuffer("o.visible=?1 ");
		List<Object> params = new ArrayList<Object>();
		params.add(true);
		pageView.setQueryResult(newsService.getScrollData(pageView.getFirstResult(), maxresult,
				jpql.toString(), params.toArray(), orderby));
		request.setAttribute("pageView", pageView);
		ModelAndView mav = new ModelAndView("/base/news_list");
		mav.addObject("pageView", pageView);
		return mav;
	}
	
	@RequestMapping("/new")
	public ModelAndView addUI() {
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
	public ModelAndView add(@ModelAttribute News news,
			@RequestParam(value = "file", required = false) MultipartFile file) {
		String oriname = file.getOriginalFilename();
		String suffix = oriname.substring(oriname.lastIndexOf("."));
		String filePath = "resource/upload/image/news" + StringUtil.generatorID() + suffix;
		File storeFile = new File(request.getSession().getServletContext().getRealPath(filePath));
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), storeFile);
			news.setId(StringUtil.generatorID());
			news.setSignImage(filePath);
			news.setSumary(WebUtil.HtmltoText(news.getContent()));
			newsService.save(news);
		} catch (IOException e) {
		}
		ModelAndView mav = new ModelAndView("redirect:list");
		return mav;
	}

}
