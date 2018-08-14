package com.xuejp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String hello = req.getParameter("hello");
		System.out.println("======hello===>"+hello);
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("hello", hello);
		return mav;
	}

}
