package com.riddhi.service.ccyconversionservice.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
public class FxRate {
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal rate;
}
