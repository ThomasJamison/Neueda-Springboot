package uk.ac.belfastmet.weather.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.Location;
import uk.ac.belfastmet.weather.domain.TodaysWeather;
import uk.ac.belfastmet.weather.domain.Weather;

@Controller
@RequestMapping("")
public class WeatherController
{
	@Value("${api.baseWeatherUrl}")
	private String baseWeatherUrl;
	
	public WeatherController()
	{
		super();
	}
	
	
	@GetMapping("/belfast")
	public String belfast(Model model)
	{
		model.addAttribute("pageTitle", "Weather");
		
		String belfastWeatherUrl = this.baseWeatherUrl + "belfast";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		Weather weather= todaysWeather.getWeather();
		
		model.addAttribute("weather", weather);
		
		return "belfastPage";
	}
	
	@GetMapping("/dublin")
	public String dublin(Model model)
	{
		model.addAttribute("pageTitle", "Weather");
		
		String belfastWeatherUrl = this.baseWeatherUrl + "dublin";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		Weather weather= todaysWeather.getWeather();
		
		model.addAttribute("weather", weather);
		
		return "dublinPage";
	}
	
	@GetMapping("/london")
	public String london(Model model)
	{
		model.addAttribute("pageTitle", "Weather");
		
		String belfastWeatherUrl = this.baseWeatherUrl + "london";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		Weather weather= todaysWeather.getWeather();
		
		model.addAttribute("weather", weather);
		
		return "londonPage";
	}
	
}
