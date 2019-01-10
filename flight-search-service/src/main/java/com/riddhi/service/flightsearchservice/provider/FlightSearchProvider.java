package com.riddhi.service.flightsearchservice.provider;

import com.riddhi.service.flightsearchservice.model.SearchRequest;
import com.riddhi.service.flightsearchservice.model.SearchResponse;

public interface FlightSearchProvider {
	SearchResponse performSearch(SearchRequest searchRequest);
}
