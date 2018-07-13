package com.testlatam.services;

import org.springframework.stereotype.Service;

import com.testlatam.exception.LatamException;
import com.testlatam.vo.CityVO;

import net.aksingh.owmjapis.model.CurrentWeather;

@Service
public interface OpenWeatherService {

	/**
	 * 
	 * @param cityVO
	 * @return CurrentWeather
	 * @throws LatamException
	 */
	CurrentWeather getCurrentWeather(CityVO cityVO)throws LatamException;
	
}
