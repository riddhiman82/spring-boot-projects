package com.riddhi.service.ccyconversionservice.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.riddhi.service.ccyconversionservice.model.FxRate;

@Service
public class FxRateService {
	
	public FxRate getFxRate(String fromCcy, String toCcy) {
		return FxRate.builder().fromCurrency(fromCcy).toCurrency(toCcy).rate(BigDecimal.ONE).build();
	}
}
