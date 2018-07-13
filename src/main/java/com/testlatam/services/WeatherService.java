package com.testlatam.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;

@Service
public class WeatherService {

	private static final Logger log = LoggerFactory.getLogger(WeatherService.class);
	
	public WeatherVO find(CityVO cityVO){
		log.info("find WeatherService");
		return null;
	}
	
}
