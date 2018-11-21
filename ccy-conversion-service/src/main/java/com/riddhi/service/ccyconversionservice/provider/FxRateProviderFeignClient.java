package com.riddhi.service.ccyconversionservice.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.riddhi.service.ccyconversionservice.model.FxRate;

@Profile("!non-feign")
@FeignClient("forex-service")
@Component
public interface FxRateProviderFeignClient extends FxRateProvider {
	
	@GetMapping(path = "/forex/fx-service/fx-rate/from/{fromCcy}/to/{toCcy}")
	@Override
	FxRate getFxRate(@PathVariable("fromCcy") String fromCcy
			, @PathVariable("toCcy") String toCcy);
}
