package com.riddhi.service.flightsearchservice.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SearchRequest {
	@NotNull
	private String searchIdentifier;
	private LocalDate tripDate;
	private Trip trip;
	private SeatingType seatingType;
}
