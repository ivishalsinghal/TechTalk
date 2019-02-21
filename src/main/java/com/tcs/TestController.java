package com.tcs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	String message = "Welcome";
	 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Skyguide") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("dummyworld");
		mv.addObject("message", message);//Invalid Comment at end of line
		mv.addObject("name", name);
		return mv;
	}
}
