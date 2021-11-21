package com.autoscape.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
public @Data class User {
	@Id
	private String username;
	private String name;
	private String lastname;
	private String password;
	private String email;
	
	@ManyToOne(
			//cascade = CascadeType.ALL
			)
	@JoinColumn(
			name = "role",
			referencedColumnName = "role"
			)
	private Role role;

}
