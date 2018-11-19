package com.riddhi.service.ccyconversionservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.riddhi.service.ccyconversionservice.model.FxRate;
import com.riddhi.service.ccyconversionservice.service.FxRateService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/fx-rate")
@AllArgsConstructor
public class CcyConversionServiceController {
	
	private FxRateService fxRateService;
	
	@GetMapping(path = "/rate-only")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FxRate getFxRate(@RequestParam("fromCcy") String fromCcy, @RequestParam("toCcy") String toCcy) {
		return fxRateService.getFxRate(fromCcy, toCcy);
	}
}
