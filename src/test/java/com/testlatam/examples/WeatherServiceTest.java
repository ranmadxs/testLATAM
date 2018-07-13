package com.testlatam.examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.testlatam.WebApplication;
import com.testlatam.services.WeatherService;
import com.testlatam.vo.CityVO;
import com.testlatam.vo.WeatherVO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplication.class, loader = SpringBootContextLoader.class)
@WebAppConfiguration
public class WeatherServiceTest {

	
	private static final Logger log = LoggerFactory.getLogger(WeatherServiceTest.class);

	@Autowired(required = true)
	private WeatherService weatherService;


	@Test
	public void findWeatherTest() {

		
		log.info("findWeatherTest");
		CityVO city = new CityVO();
		city.setCity("London");
		city.setMode("xml");
		city.setUnits("");
		WeatherVO weather = weatherService.find(city);
		Assert.assertNotNull("Weather can not be null", weather);


	}
}