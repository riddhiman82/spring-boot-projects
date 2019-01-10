package com.riddhi.service.flightsearchservice.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riddhi.service.flightsearchservice.model.SearchRequest;
import com.riddhi.service.flightsearchservice.model.SearchResponse;

@FeignClient("wts-service")
@Component
public interface FlightSearchClient extends FlightSearchProvider {

	@PostMapping("/wts/search-flights")
	@Override
	public @ResponseBody SearchResponse performSearch(@RequestBody SearchRequest searchRequest);

}
