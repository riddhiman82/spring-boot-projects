package com.riddhi.service.flightsearchservice.model;

public enum SeatingType {
	BUSINESS("Business"),
	ECONOMY("Economy");
	
	private final String description;
	
	private SeatingType(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
