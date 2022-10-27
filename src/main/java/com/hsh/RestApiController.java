package com.hsh;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@GetMapping("/healthCheck")
	String AController() {
		return "healthCheck OK";
	}
	
	@PostMapping("/get/test1")
	String BController() {
		return "hi2";
	}
}
