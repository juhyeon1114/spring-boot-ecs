package com.study.ecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping
	public String index() {
		return "Hello order service";
	}

	@GetMapping("/health")
	public String health() {
		return "OK";
	}

}
