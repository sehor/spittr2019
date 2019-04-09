package com.spittr.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the bankreord database table.
 * 
 */
@Entity
@NamedQuery(name="Bankrecord.findAll", query="SELECT b FROM Bankrecord b")
public class Bankrecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private double number;

	public Bankrecord() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getNumber() {
		return this.number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

}