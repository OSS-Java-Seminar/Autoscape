package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Receipt {
	
	@Id
	private Long receiptId;
	private Boolean confirmation;
	private double price;
	private String status;
	
	@OneToOne()
	@JoinColumn(
			name = "RESERVATION_ID",
			referencedColumnName ="reservationId"
			)
	Reservation reservation;
}
