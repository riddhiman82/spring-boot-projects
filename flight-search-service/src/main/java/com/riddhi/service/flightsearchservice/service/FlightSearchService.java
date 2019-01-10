package com.riddhi.service.flightsearchservice.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.riddhi.service.flightsearchservice.model.SearchRequest;
import com.riddhi.service.flightsearchservice.model.SearchResponse;
import com.riddhi.service.flightsearchservice.provider.FlightSearchProvider;
import com.riddhi.service.flightsearchservice.repository.SearchRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FlightSearchService {

	private FlightSearchProvider provider;
	private SearchRepository repository;
	
	public SearchResponse performSearch(SearchRequest searchRequest) {
		SearchResponse searchResponse = repository.getBySearchId(searchRequest.getSearchIdentifier());
		if (searchResponse == null) {
			search(searchRequest);
			searchResponse = SearchResponse.builder().timeStamp(LocalDateTime.now()).tripDate(searchRequest.getTripDate()).status("Processing").build();
		} else {
			searchResponse.setStatus("Completed");
		}
		return searchResponse;
	}
	
	@Async("threadPoolTaskExecutor")
	protected void search(SearchRequest searchRequest) {
		SearchResponse searchResponse = provider.performSearch(searchRequest);
		repository.save(searchRequest.getSearchIdentifier(), searchResponse);
	}
}
