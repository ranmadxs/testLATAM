package com.testlatam.services;

import com.testlatam.exception.LatamException;
import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;

public interface WeatherService {

	/**
	 * Find city by name, unit and mode
	 * @author esanchez
	 * @param cityVO
	 * @return WeatherVO
	 */
	WeatherVO find(CityVO cityVO) throws LatamException;

}
