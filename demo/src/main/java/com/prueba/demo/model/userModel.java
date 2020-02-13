package com.prueba.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class userModel {
	@Id
	@Column(name = "idUser")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;
	@Column(name = "userName", unique = true)
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	@Value("user")
	private byte role;
	@Column(name = "name")
	private String name;

	public userModel() {
	};

	public userModel(String id, String userName, String password, byte role, String name) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.name = name;
	}

}
