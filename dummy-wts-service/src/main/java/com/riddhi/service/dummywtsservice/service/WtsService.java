package com.riddhi.service.dummywtsservice.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Service;

import com.riddhi.service.dummywtsservice.model.FlightOption;
import com.riddhi.service.dummywtsservice.model.SearchRequest;
import com.riddhi.service.dummywtsservice.model.SearchResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WtsService {

	public SearchResponse searchFlights(SearchRequest searchRequest) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			log.error("Error in slowness simulation", e);
		}
		return SearchResponse.builder().tripDate(searchRequest.getTripDate())
				.timeStamp(LocalDateTime.now())
				.trip(searchRequest.getTrip())
				.seatingType(searchRequest.getSeatingType())
				.flightOptions(
						Collections.singletonList(FlightOption.builder()
								.airline("Emirates")
								.duration(BigDecimal.valueOf(21.8))
								.price(new FlightOption.Price("INR", BigDecimal.valueOf(36029.00)))
								.stopOvers(Collections.singletonList(new FlightOption.StopOver("Dubai", BigDecimal.valueOf(2.0))))
								.build())
						).build();
	}
	
}
