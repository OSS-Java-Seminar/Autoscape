package com.autoscape.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class Receipt {
	
	@Id
	private int receiptId;
	private int confirmation;
	private double price;
}
