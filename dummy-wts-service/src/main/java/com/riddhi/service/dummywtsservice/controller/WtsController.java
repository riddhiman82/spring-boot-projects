package com.riddhi.service.dummywtsservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.riddhi.service.dummywtsservice.model.SearchRequest;
import com.riddhi.service.dummywtsservice.model.SearchResponse;
import com.riddhi.service.dummywtsservice.service.WtsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/wts")
@AllArgsConstructor
public class WtsController {
	private WtsService service;
	
	@PostMapping("/search-flights")
	public @ResponseBody SearchResponse searchFlights(@RequestBody SearchRequest searchRequest) {
		return service.searchFlights(searchRequest);
	}
}
