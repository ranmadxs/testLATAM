package com.testlatam.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testlatam.exception.LatamException;
import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;

import net.aksingh.owmjapis.model.CurrentWeather;
import net.aksingh.owmjapis.model.param.Weather;

@Service
public class WeaterServiceImpl implements WeatherService {

	private static final Logger log = LoggerFactory.getLogger(WeatherService.class);

	@Autowired(required = true)
	private OpenWeatherService openWeatherService;

	public WeatherVO find(CityVO cityVO) throws LatamException {
		log.info("find WeatherService");
		
		if(cityVO.getCity().isEmpty()){
			throw new LatamException("City empty", "ERR01");
		}
		
		if(cityVO.getUnits().isEmpty()){
			throw new LatamException("Units empty", "ERR02");
		}
		
		CurrentWeather currentWeather = openWeatherService.getCurrentWeather(cityVO);
		
		if (currentWeather == null || currentWeather.getWeatherList() == null
				|| currentWeather.getWeatherList().isEmpty()) {
			throw new LatamException("Not found", "ERR03");
		}

		WeatherVO weather = new WeatherVO();
		weather.setCity(cityVO.getCity());
		weather.setCountry(currentWeather.getSystemData().getCountryCode());
		weather.setCurrentWeather(currentWeather.getMainData().getTemp());
		weather.setLatitude(currentWeather.getCoordData().getLatitude());
		weather.setLongitude(currentWeather.getCoordData().getLongitude());
		weather.setWindSpeed(currentWeather.getWindData().getSpeed());
		return weather;
	}

}
