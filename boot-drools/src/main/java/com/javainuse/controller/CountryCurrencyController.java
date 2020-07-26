package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Country;
import com.javainuse.service.CountryCurrencyService;
@RestController
public class CountryCurrencyController {
	
	@Autowired
	private CountryCurrencyService countryCurrencyService;
	/**
	 * eg:http://localhost:9081/getCurrency?countryName=usa
	 * http://localhost:9081/getCurrency?countryName=india
	 * @param countryName
	 * @return
	 */
	@RequestMapping(value="/getCurrency", method=RequestMethod.GET, produces="application/json" )
	public Country getCurrency(@RequestParam("countryName")String countryName) {
		Country country = new Country();
		country.setCountryName(countryName);
		countryCurrencyService.getCurrency(country);
		return country;
	}

}
