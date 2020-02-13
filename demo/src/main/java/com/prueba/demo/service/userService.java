/**
 * 
 */
package com.prueba.demo.service;

import java.util.List;

import com.prueba.demo.model.userModel;

/**
 * @author christian
 *
 */
public interface userService {
	public void delete(String id);

	public List<userModel> getUser();

	public userModel getUsers(String id);

	public userModel create(userModel user);
	public userModel signIn(String userName, String password);
}
