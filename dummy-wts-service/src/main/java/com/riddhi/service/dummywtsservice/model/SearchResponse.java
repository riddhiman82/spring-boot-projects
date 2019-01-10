package com.riddhi.service.dummywtsservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SearchResponse {
	private LocalDate tripDate;
	private LocalDateTime timeStamp;
	private Trip trip;
	private SeatingType seatingType;
	private List<FlightOption> flightOptions;
}
