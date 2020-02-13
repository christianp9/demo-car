/**
 * 
 */
package com.prueba.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
/**
 * @author christian
 *
 */

@Data
@Entity
@Table(name="cars")
public class carModel {
	@Id
	@Column(name = "idCar")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;
	@Column(name = "modelCar")
	private String model;
	@Column(name = "colorCar")
	private String color;
	@Column(name = "quantity")
	private int quantity;
	
}
