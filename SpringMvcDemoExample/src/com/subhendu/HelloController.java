package com.subhendu;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Map m = new HashMap<String,String>();
		System.out.println("assasa");
		m.put("name",req.getAttribute("name"));
		System.out.println("HEREEEEEEEEEEEEEEEEEEEEEE");
		ModelAndView model = new ModelAndView();
		model.addObject("success", m);
		return model;
	}

}
