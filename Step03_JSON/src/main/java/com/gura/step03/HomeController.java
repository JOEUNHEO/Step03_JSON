package com.gura.step03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		
	@RequestMapping("/home")
	public ModelAndView home() {
		
		ModelAndView mView = new ModelAndView();
		
		List<String> news = new ArrayList<>();
		news.add("하나");
		news.add("두울");
		news.add("어쩌구...저쩌구....");
		
		mView.addObject("news", news);
		mView.setViewName("home");
						
		return mView;
	}
}
