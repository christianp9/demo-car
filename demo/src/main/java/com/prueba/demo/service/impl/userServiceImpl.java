package com.prueba.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.model.userModel;
import com.prueba.demo.repository.userRepository;
import com.prueba.demo.service.userService;

@Service
public class userServiceImpl implements userService {
	
	@Autowired(required = true)
	private userRepository repository;


	@Override
	public List<userModel> getUser() {
		return repository.findAll();
	}

	@Override
	public userModel getUsers(String id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public userModel create(userModel user) {
		return repository.save(user);
	}

	@Override
	public userModel signIn(String userName, String password) {
		return repository.findByUserName(userName, password);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
		
	}
	
}
