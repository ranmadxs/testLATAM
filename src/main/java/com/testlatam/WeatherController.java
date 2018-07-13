package com.testlatam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testlatam.services.WeatherService;
import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	private static final Logger log = LoggerFactory.getLogger(WeatherService.class);

	@Autowired(required = true)
	private WeatherService weatherService;

	@RequestMapping(value = "/find", method = { RequestMethod.GET,
			RequestMethod.POST }, produces = "application/json; charset=UTF-8")
	public HttpEntity<WeatherVO> find(@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "units", required = true) String units,
			@RequestParam(value = "mode", required = false, defaultValue = "xml") String mode) {
		log.info("city=".concat(city).concat(", units=").concat(units).concat(", mode=").concat(mode));
		CityVO cityVO = new CityVO();
		cityVO.setCity(city);
		cityVO.setMode(mode);
		cityVO.setUnits(units);
		WeatherVO weaterVO = weatherService.find(cityVO);
		return new ResponseEntity<WeatherVO>(weaterVO, HttpStatus.OK);
	}
}
