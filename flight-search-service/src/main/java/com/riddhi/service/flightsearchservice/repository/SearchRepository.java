package com.riddhi.service.flightsearchservice.repository;

import com.riddhi.service.flightsearchservice.model.SearchResponse;

public interface SearchRepository {
	SearchResponse getBySearchId(String searchId);
	void save(String searchId, SearchResponse searchResponse);
}