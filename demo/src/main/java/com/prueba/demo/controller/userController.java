/**
 * 
 */
package com.prueba.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.demo.model.userModel;
import com.prueba.demo.service.impl.userServiceImpl;

/**
 * @author christian
 *
 */
@RestController
@CrossOrigin("http://localhost:4200")
public class userController {
	@Autowired(required = true)
	userServiceImpl service;

	@PostMapping("/loginUsuario")
	public userModel login(@RequestBody userModel user) {

		return service.signIn(user.getUserName(), user.getPassword());
	}
	@PostMapping("/create")
	public userModel signUp(@RequestBody userModel user) {
		return service.create(user);
	}
}
