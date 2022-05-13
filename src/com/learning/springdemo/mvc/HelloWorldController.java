package com.learning.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process initial form
		@RequestMapping("/processForm")
		public String processForm() {
			return "helloworld";
		}
		
		//new controller method to read form data
		//add data to the model
		
		@RequestMapping("/processFormVersionTwo")
		public String letsShoytDude(HttpServletRequest request, Model model) {
			
			//read the request parameter
			String theName = request.getParameter("studentName");
			
			//convert the data to all caps
			theName = theName.toUpperCase();
			
			//create the message
			String result = "Yo! "+theName;
			
			//add message to the model
			model.addAttribute("message", result);
			
			return "helloworld";
		}
}