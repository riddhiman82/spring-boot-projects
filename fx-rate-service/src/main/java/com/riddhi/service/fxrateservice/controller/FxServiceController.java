package com.riddhi.service.fxrateservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riddhi.service.fxrateservice.model.FxRate;
import com.riddhi.service.fxrateservice.service.FxService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/fx-service")
@AllArgsConstructor
public class FxServiceController {
	
	private FxService service;
	
	@GetMapping(path = "/fx-rate/from/{fromCcy}/to/{toCcy}")
	public FxRate getFxRate(@PathVariable("fromCcy") String fromCcy
			, @PathVariable("toCcy") String toCcy) {
		return service.getFxRate(fromCcy, toCcy);
	}
}
