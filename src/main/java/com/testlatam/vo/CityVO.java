package com.testlatam.vo;

import java.io.Serializable;

public class CityVO implements Serializable{

	private static final long serialVersionUID = 7051824060289112822L;

	private String city;
	private String units;
	private String mode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	
}
