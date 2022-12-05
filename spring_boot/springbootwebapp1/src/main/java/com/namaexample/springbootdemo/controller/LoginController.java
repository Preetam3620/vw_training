package com.namaexample.springbootdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("username")
@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";

	}

	@PostMapping("/login")
	public String checkLogin(@RequestParam String username, @RequestParam String password, ModelMap model) {

		if (username.equalsIgnoreCase("namrata") & password.equalsIgnoreCase("marathe")) {
			model.addAttribute("username", username);
			return "loginsuccess";
		} else {
			model.addAttribute("username", username);
			model.addAttribute("errormsg", "Login Invalid!");
			return "login";
		}

	}

}
