package com.testlatam.examples;

import javax.validation.constraints.AssertFalse;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

//import net.aksingh.owmjapis.DailyForecast;
//import net.aksingh.owmjapis.OpenWeatherMap;


//api.openweathermap.org/data/2.5/forecast?id=524901&APPID=5033bf272d0da8eee6c5fc0e3bb78400 
//http://api.openweathermap.org/data/2.5/find?q=London&units=metric&mode=json&APPID=5033bf272d0da8eee6c5fc0e3bb78400
//5033bf272d0da8eee6c5fc0e3bb78400
public class OpenweathermapTest {

	private static final Logger log = LoggerFactory.getLogger(OpenweathermapTest.class);
	
	@Test
	public void test() {
		boolean isMetric = true;
		CurrentWeather currentWeather;
	    String owmApiKey = "5033bf272d0da8eee6c5fc0e3bb78400"; /* YOUR OWM API KEY HERE */
	    String weatherCity = "London";
	    byte forecastDays = 3;

	    OWM owm = new OWM(owmApiKey);
	    try {
			currentWeather = owm.currentWeatherByCityName(weatherCity);
			//owm.setUnit(value);
			log.info(currentWeather.toString());
		} catch (APIException e) {
			Assert.assertTrue(e.getMessage(), Boolean.FALSE);
		}
	    
//	    OpenWeatherMap.Units units = (isMetric)
//	        ? OpenWeatherMap.Units.METRIC
//	        : OpenWeatherMap.Units.IMPERIAL;
//	    OpenWeatherMap owm = new OpenWeatherMap(units, owmApiKey);
//	    try {
//	    	DailyForecast forecast = owm.dailyForecastByCityName(weatherCity, forecastDays);
//	      System.out.println("Weather for: " + forecast.getCityInstance().getCityName());
//	      int numForecasts = forecast.getForecastCount();
//	      for (int i = 0; i < numForecasts; i++) {
//	        DailyForecast.Forecast dayForecast = forecast.getForecastInstance(i);
//	        DailyForecast.Forecast.Temperature temperature = dayForecast.getTemperatureInstance();
//	        System.out.println("\t" + dayForecast.getDateTime());
//	        System.out.println("\tTemperature: " + temperature.getMinimumTemperature() +
//	            " to " + temperature.getMaximumTemperature() + "\n");
//	      }
//	    }
//	    catch (Exception e) {
//	      e.printStackTrace();
//	    }		
	}
	
}
