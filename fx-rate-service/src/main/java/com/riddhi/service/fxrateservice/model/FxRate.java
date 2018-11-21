package com.riddhi.service.fxrateservice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FxRate {
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal rate;
}
