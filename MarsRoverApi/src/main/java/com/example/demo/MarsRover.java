package com.example.demo;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {

	private long id;
	private String name;
	
	@JsonProperty("landing_date")
	private String landingDate;

	@Override
	public String toString() {
		return "MarsRover [id=" + id + ", name=" + name + ", landingDate=" + landingDate + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandingDate() {
		return landingDate;
	}

	public void setLandingDate(String landingDate) {
		this.landingDate = landingDate;
	}
	
	
	
}
