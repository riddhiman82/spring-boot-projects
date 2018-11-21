package com.riddhi.service.ccyconversionservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED)
public class ForexRateNotFoundException extends RuntimeException {
	public ForexRateNotFoundException(String fromCurrency, String toCurrency) {
		super("Unable to find FX rate for currency pair [" + fromCurrency + ", " + toCurrency + "]");
	}
}
