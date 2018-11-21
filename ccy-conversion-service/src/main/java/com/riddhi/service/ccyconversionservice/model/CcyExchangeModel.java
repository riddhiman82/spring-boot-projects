package com.riddhi.service.ccyconversionservice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CcyExchangeModel {
	private String fromCurrency;
	private String toCurrency;
	private BigDecimal rate;
	private BigDecimal requestedAmount;
	private BigDecimal convertedAmount;
}
