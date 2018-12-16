package com.tts.LinkedUp.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/signup")
	public ModelAndView newUser(User user) {
		ModelAndView mv = new ModelAndView("user/newUser");
		return mv;
	}

	//handles the saving of the new user
	@PostMapping("/signup")
	public ModelAndView createUser(User user) {
		ModelAndView mv = new ModelAndView("user/index");
		userRepository.save(user);
//		mv.addObject("user", user);
		return mv;
	}
	
	//shows the form for editing a new user
	@GetMapping("/user/edit/{id}")
	public ModelAndView updateFormForUser(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("user/editUser");
		Optional<User> userInfo = userRepository.findById(id);
		mv.addObject("user", userInfo);
		return mv;
	}
	
	//saves the edits to the user
	@PutMapping("/user/edit")
	public ModelAndView updateUser(User user) {
		ModelAndView mv = new ModelAndView("redirect:/");
		userRepository.save(user);
		return mv;
	}
}