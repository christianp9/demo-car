/**
 * 
 */
package com.prueba.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.demo.model.userModel;

/**
 * @author christian
 *
 */
@Repository("userRepository")
public interface userRepository extends JpaRepository<userModel, String>{
	@Query(value="SELECT * FROM users WHERE user_name = ?1 AND password = ?2", nativeQuery = true)
	public userModel findByUserName(String userName, String password);
}
