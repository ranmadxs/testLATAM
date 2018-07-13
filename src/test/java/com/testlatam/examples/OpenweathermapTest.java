package com.testlatam.examples;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

//api.openweathermap.org/data/2.5/forecast?id=524901&APPID=5033bf272d0da8eee6c5fc0e3bb78400 
//http://api.openweathermap.org/data/2.5/find?q=London&units=metric&mode=json&APPID=5033bf272d0da8eee6c5fc0e3bb78400
//5033bf272d0da8eee6c5fc0e3bb78400
public class OpenweathermapTest {

	private static final Logger log = LoggerFactory.getLogger(OpenweathermapTest.class);
	
	@Test
	@Ignore
	public void test() {
		boolean isMetric = true;
		CurrentWeather currentWeather;
	    String owmApiKey = "5033bf272d0da8eee6c5fc0e3bb78400"; /* YOUR OWM API KEY HERE */
	    String weatherCity = "Madrid";
	    byte forecastDays = 3;

	    OWM owm = new OWM(owmApiKey);
	    try {
			currentWeather = owm.currentWeatherByCityName(weatherCity);
			//owm.setUnit(value);
			log.info(currentWeather.toString());
		} catch (APIException e) {
			Assert.assertTrue(e.getMessage(), Boolean.FALSE);
		}
	    	
	}
	
}
