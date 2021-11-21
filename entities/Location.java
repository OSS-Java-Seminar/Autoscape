package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Location {
	
	@Id
	private int locationId;
	private int postalCode;
	private String adress;
}
