package com.hydom.common.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manage/order")
public class OrderServlet {
	
	@RequestMapping("/list")
	public ModelAndView  list(){
		ModelAndView mav = new ModelAndView("core/order_list");
		return mav;
	}
	@RequestMapping("/list/store")
	public ModelAndView  listState0(){
		ModelAndView mav = new ModelAndView("core/order_list_state0");
		mav.addObject("m", 1);
		return mav;
	}
	@RequestMapping("/list/post")
	public ModelAndView  listState1(){
		ModelAndView mav = new ModelAndView("core/order_list_state1");
		return mav;
	}
}
