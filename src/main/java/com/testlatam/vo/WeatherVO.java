package com.testlatam.vo;

import java.io.Serializable;

public class WeatherVO implements Serializable{

	private static final long serialVersionUID = -8524852318031511849L;

	private String city;
	private String country;
	private Double latitude;
	private Double longitude;
	private Integer currentWeather;
	private Double windSpeed;
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Integer getCurrentWeather() {
		return currentWeather;
	}
	public void setCurrentWeather(Integer currentWeather) {
		this.currentWeather = currentWeather;
	}
	public Double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
