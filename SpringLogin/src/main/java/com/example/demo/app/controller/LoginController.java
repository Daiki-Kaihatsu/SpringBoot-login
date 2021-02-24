package com.example.demo.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


	@GetMapping
	public String getSignUp(Model model) {
		System.out.println("loginController");
		return "login";
	}

	@PostMapping
	public String postSignUp(Model model) {
		return "redirect:/userList";
	}
}