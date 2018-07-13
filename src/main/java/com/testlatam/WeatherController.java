package com.testlatam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.testlatam.services.WeatherService;
import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/weather")
public class WeatherController {
	
	private static final Logger log = LoggerFactory.getLogger(WeatherService.class);
	
	@Autowired(required = true)
	private WeatherService weatherService;
	
	@RequestMapping("/find")
	public String find(Model model,
			@RequestParam(value = "city", required = false, defaultValue = "London") String city,
			@RequestParam(value = "units", required = false, defaultValue = "metric") String units,
			@RequestParam(value = "mode", required = false, defaultValue = "xml") String mode) {
		log.info("city=".concat(city).concat(", units=").concat(units).concat(", mode=").concat(mode));
		model.addAttribute("name", city);
		CityVO cityVO = new CityVO();
		cityVO.setCity(city);
		cityVO.setMode(mode);
		cityVO.setUnits(units);
		WeatherVO weaterVO = weatherService.find(cityVO);		
		return "weather";
	}
}
