package ca.sheridancollege.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

	// Loads Landing page
	@GetMapping("/")
	public String goHome() {
		return "home.html";
	}
}
