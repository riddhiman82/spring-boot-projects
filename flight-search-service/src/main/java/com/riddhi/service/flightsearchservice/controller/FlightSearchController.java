package com.riddhi.service.flightsearchservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.riddhi.service.flightsearchservice.model.SearchRequest;
import com.riddhi.service.flightsearchservice.model.SearchResponse;
import com.riddhi.service.flightsearchservice.service.FlightSearchService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FlightSearchController {
	private FlightSearchService searchService;
	
	@PostMapping("/perform")
	public @ResponseBody SearchResponse performSearch(@RequestBody SearchRequest searchRequest) {
		return searchService.performSearch(searchRequest);
	}
}
