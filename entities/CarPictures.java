package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class CarPictures {
	@Id
	private String licensePlate;
	private int pictureId;
}
