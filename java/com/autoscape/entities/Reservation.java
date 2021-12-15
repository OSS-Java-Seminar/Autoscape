package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Reservation {
	
	@Id
	private Long reservationId;
	private long dateFrom;
	private long dateTo;
	
	@ManyToOne()
	@JoinColumn(
			name="USER_ID",
			referencedColumnName="userId"
			)
	User user;
	
	@ManyToOne()
	@JoinColumn(
			name = "CAR_ID",
			referencedColumnName = "carId"
			)
	Car car;
}
