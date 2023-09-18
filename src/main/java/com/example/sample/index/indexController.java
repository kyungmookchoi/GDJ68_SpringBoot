package com.example.sample.index;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class indexController {

	@GetMapping("/")
	@ResponseBody
	public String getIndex() {
		return "index";
	}
}
