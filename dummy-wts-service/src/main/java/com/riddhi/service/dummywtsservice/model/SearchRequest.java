package com.riddhi.service.dummywtsservice.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SearchRequest {
	private LocalDate tripDate;
	private Trip trip;
	private SeatingType seatingType;
}
