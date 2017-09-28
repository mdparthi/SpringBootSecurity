package com.qht.boot.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping("/hello")
	private String hello() {
		return "hello";

	}
}
