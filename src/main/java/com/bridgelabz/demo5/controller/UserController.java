package com.bridgelabz.demo5.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.demo5.dto.UserDto;
import com.bridgelabz.demo5.service.IService;
import com.bridgelabz.demo5.util.Response;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired(required = true)
	private IService service;
	
	
	@PostMapping("/register")
	ResponseEntity<Response> register(@Valid @RequestBody UserDto userDto) {
		Response response = service.register(userDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
