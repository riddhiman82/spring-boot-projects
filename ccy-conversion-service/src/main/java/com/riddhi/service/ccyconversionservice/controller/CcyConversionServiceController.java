package com.riddhi.service.ccyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.riddhi.service.ccyconversionservice.model.CcyExchangeModel;
import com.riddhi.service.ccyconversionservice.service.CcyConversionService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/convert")
@AllArgsConstructor
public class CcyConversionServiceController {
	
	private CcyConversionService ccyService;
	
	@GetMapping(path = "/conversion-info")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody CcyExchangeModel getConvertionInformation(@RequestParam("fromCcy") String fromCcy, @RequestParam("toCcy") String toCcy, @RequestParam("amount") BigDecimal amount) {
		return ccyService.convertCurrency(fromCcy, toCcy, amount);
	}
}
