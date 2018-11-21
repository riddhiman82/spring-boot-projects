package com.riddhi.service.ccyconversionservice.provider;

import com.riddhi.service.ccyconversionservice.model.FxRate;

public interface FxRateProvider {
	FxRate getFxRate(String fromCurrency, String toCurrency);
}
