package com.riddhi.service.fxrateservice.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.riddhi.service.fxrateservice.model.FxRate;

@Service
public class FxService {

	public FxRate getFxRate(String fromCcy, String toCcy) {
		return new FxRate(fromCcy, toCcy, BigDecimal.valueOf(50.00));
	}

}
