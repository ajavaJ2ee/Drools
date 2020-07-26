package com.javainuse.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Country;
@Service
public class CountryCurrencyService {

	private final KieContainer kieContainer;
	@Autowired
	public CountryCurrencyService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Country getCurrency(Country country) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(country);
		kieSession.fireAllRules();
		kieSession.dispose();

		return country;

	}

}
