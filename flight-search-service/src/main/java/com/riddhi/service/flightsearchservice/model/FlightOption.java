package com.riddhi.service.flightsearchservice.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightOption {
	private String airline;
	private Price price;
	private List<StopOver> stopOvers;
	private BigDecimal duration;
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	public static class Price {
		private String currency;
		private BigDecimal price;
	}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	public static class StopOver {
		private String location;
		private BigDecimal duration;
	}
}