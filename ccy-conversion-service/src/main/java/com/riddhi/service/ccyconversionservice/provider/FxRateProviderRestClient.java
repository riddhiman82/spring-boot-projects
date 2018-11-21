package com.riddhi.service.ccyconversionservice.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.riddhi.service.ccyconversionservice.exception.ForexRateNotFoundException;
import com.riddhi.service.ccyconversionservice.model.FxRate;

import lombok.extern.slf4j.Slf4j;

@Profile("non-feign")
@Component
@Slf4j
public class FxRateProviderRestClient implements FxRateProvider {
	
	@Value("${fx.service.host}")
	private String fxServiceHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public FxRate getFxRate(String fromCurrency, String toCurrency) {
		log.info("Invoking forex service on host {} with path {} " , fxServiceHost , buildPath(fromCurrency, toCurrency));
		
		ResponseEntity<FxRate> responseEntity = restTemplate.exchange(fxServiceHost + buildPath(fromCurrency, toCurrency), HttpMethod.GET, null, FxRate.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			return responseEntity.getBody();
		}
		throw new ForexRateNotFoundException(fromCurrency, toCurrency);
	}

	private String buildPath(String fromCurrency, String toCurrency) {
		return "/fx-service/fx-rate/from/" + fromCurrency + "/to/" + toCurrency;
	}
	
}
