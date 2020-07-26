package com.javainuse.model;

public class Country {

	private String countryName;
	private String countryCurrency;
	public Country() {
		super();
	}
	public Country(String countryName, String countryCurrency) {
		super();
		this.countryName = countryName;
		this.countryCurrency = countryCurrency;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCurrency() {
		return countryCurrency;
	}
	public void setCountryCurrency(String countryCurrency) {
		this.countryCurrency = countryCurrency;
	}
	
}
