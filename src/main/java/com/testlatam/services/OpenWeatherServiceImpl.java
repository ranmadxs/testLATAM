package com.testlatam.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.testlatam.exception.LatamException;
import com.testlatam.vo.CityVO;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.core.OWM.Unit;
import net.aksingh.owmjapis.model.CurrentWeather;

@Service
public class OpenWeatherServiceImpl implements OpenWeatherService{

	private static final Logger log = LoggerFactory.getLogger(OpenWeatherServiceImpl.class);
	
	@Value("${owmApiKey}")
	private String owmApiKey;
	
	public CurrentWeather getCurrentWeather(CityVO cityVO)throws LatamException{
		CurrentWeather currentWeather = null;

	    Unit unit = cityVO.getUnits().equals("Imperial")?Unit.IMPERIAL:Unit.METRIC;
	    OWM owm = new OWM(owmApiKey);
	    try {
			currentWeather = owm.currentWeatherByCityName(cityVO.getCity());
			owm.setUnit(unit);
			log.info(currentWeather.toString());
		} catch (APIException e) {
			throw new LatamException("OWM error getCurrentWeather", e);
		}
	    return currentWeather;
	}
	
}
