package com.apigateway.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userservicefallback")
	public ResponseEntity<String> userServiceFallback(){
		
		return ResponseEntity.ok("User service down");		
	}
	
	@GetMapping("/contactservicefallback")
	public ResponseEntity<String> contactServiceFallback(){
		
		return ResponseEntity.ok("Contact service down");		
	}
	
}
