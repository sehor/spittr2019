package com.spittr.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spitter database table.
 * 
 */
@Entity
@NamedQuery(name="Spitter.findAll", query="SELECT s FROM Spitter s")
public class Spitter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="spitter_id")
	private int spitterId;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String password;

	private String username;

	public Spitter() {
	}

	public int getSpitterId() {
		return this.spitterId;
	}

	public void setSpitterId(int spitterId) {
		this.spitterId = spitterId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}