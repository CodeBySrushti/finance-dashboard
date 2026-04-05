package com.example.financedashboard.entity;

import jakarta.persistence.Entity;
import com.example.financedashboard.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "users") 
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	private Boolean active =  true;
	
	//getters and setters
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Role getRole() {
		return role;
	}
	public Boolean Isactive() {
		return active;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public void setRole(Role role) {
		this.role= role;
	}
	public void setActive (Boolean active) { 
		this.active= active;
	}

}
