package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService es;
	@RequestMapping("/compose")
public String composeEmail(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
	return "compose_email";
	
}
	@RequestMapping("/composeEmail")
	public String compose(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("message") String message, Model model) {
		es.sendEmail(to, subject, message);
		model.addAttribute("msg", "email sent successfully");
		return "compose_email";
		
	}
}
