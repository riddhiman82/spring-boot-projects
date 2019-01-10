package com.riddhi.service.flightsearchservice.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.riddhi.service.flightsearchservice.model.SearchResponse;

@Repository
public class FlightSearchRepository implements SearchRepository {

	private Map<String, SearchResponse> searchResponses = new HashMap<>();

	@Override
	public SearchResponse getBySearchId(String searchId) {
		return searchResponses.get(searchId);
	}

	@Override
	public void save(String searchId, SearchResponse searchResponse) {
		searchResponses.put(searchId, searchResponse);
	}

}
