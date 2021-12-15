package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Pictures {
	
	@Id
	private int pictureId;
	private String url;
	
	@ManyToOne(
			)
	@JoinColumn(
			name = "CAR_ID",
			referencedColumnName = "carId"
			)
	Car car;
	
}
