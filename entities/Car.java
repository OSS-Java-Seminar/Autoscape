package com.autoscape.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Car {
	@Id
	private String licensePlate;
	private int year;
	private String model;
	private String manufacturer;
	
	@ManyToOne
	@JoinColumn(
			name = "username",
			referencedColumnName = "username"
			)
	private User user;
}
