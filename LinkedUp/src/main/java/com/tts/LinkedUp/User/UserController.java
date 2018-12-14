package com.tts.LinkedUp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("user/index");
		return mv;
	}

}
