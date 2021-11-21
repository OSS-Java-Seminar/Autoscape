package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Reservation {
	
	@Id
	private int reservationId;
	private long dateFrom;
	private long dateTo;
}
