package com.example.contactus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
class ContactController{
	@GetMapping("/contact")
	public String ShowContactForm() {
		return "Contact";
	}
	@PostMapping("/submit")
	public String SubmitContactForm(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String phone,
			@RequestParam String message,
			Model model
			) {
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("phone", phone);
		model.addAttribute("message", message);
		return "confirmation";
	}
}

@SpringBootApplication
public class ContactusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactusApplication.class, args);
		
		
	}

}
