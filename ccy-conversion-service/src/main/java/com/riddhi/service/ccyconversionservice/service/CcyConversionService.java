package com.riddhi.service.ccyconversionservice.service;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Service;

import com.riddhi.service.ccyconversionservice.model.CcyExchangeModel;
import com.riddhi.service.ccyconversionservice.model.FxRate;
import com.riddhi.service.ccyconversionservice.provider.FxRateProvider;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CcyConversionService {
	
	private FxRateProvider fxRateProvider;
	
	public CcyExchangeModel convertCurrency(String fromCcy, String toCcy, BigDecimal amount) {
		FxRate fxRate = fxRateProvider.getFxRate(fromCcy, toCcy);
		
		return CcyExchangeModel.builder()
														.fromCurrency(fxRate.getFromCurrency())
														.toCurrency(fxRate.getToCurrency())
														.rate(fxRate.getRate())
														.requestedAmount(amount)
														.convertedAmount(amount.multiply(fxRate.getRate(), MathContext.DECIMAL32))
														.build();
	}
}
