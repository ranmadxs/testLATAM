package com.testlatam.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;

@Service
public class WeaterServiceImpl implements WeatherService{

	private static final Logger log = LoggerFactory.getLogger(WeatherService.class);
	
	public WeatherVO find(CityVO cityVO){
		log.info("find WeatherService");
		WeatherVO weather = new WeatherVO();
		weather.setCity("NONE_CITY");
		weather.setCountry("NONE_COUNTRY");
		weather.setCurrentWeather(1);
		weather.setLatitude(2.1d);
		weather.setLongitude(3.2d);
		weather.setWindSpeed(10.7d);
		return weather;
	}
	
}
