package com.alphatest.Models;

import java.util.Map;

public class ExchangeRates {

    private String disclaimer;
    private String license;
    private Integer timestamp;
    private String base;
    private Map<String, Double> rates;
    
	public String getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Integer getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Map<String, Double> getRates() {
		return rates;
	}
	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}
	public ExchangeRates() {
		super();
	}
	public ExchangeRates(String disclaimer, String license, Integer timestamp, String base, Map<String, Double> rates) {
		super();
		this.disclaimer = disclaimer;
		this.license = license;
		this.timestamp = timestamp;
		this.base = base;
		this.rates = rates;
	}
    
    
}
