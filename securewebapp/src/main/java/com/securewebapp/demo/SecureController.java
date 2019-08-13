package com.securewebapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SecureController {
	
	@GetMapping("/alert")
	public String getAlertPage() {
		return "alert.html";
	}

}
