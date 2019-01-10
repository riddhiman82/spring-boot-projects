package com.riddhi.service.flightsearchservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchResponse {
	private LocalDate tripDate;
	private LocalDateTime timeStamp;
	private String status;
	private Trip trip;
	private SeatingType seatingType;
	private List<FlightOption> flightOptions;
}
