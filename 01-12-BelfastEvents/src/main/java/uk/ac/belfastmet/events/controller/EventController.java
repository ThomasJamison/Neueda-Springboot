package uk.ac.belfastmet.events.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.events.domain.BelfastEvents;
import uk.ac.belfastmet.events.domain.Event;



@Controller
@RequestMapping("")
public class EventController
{
	
	
	public EventController()
	{
		
	}
	
	@GetMapping("/")
	public String belfast(Model model)
	{
		model.addAttribute("pageTitle", "Events");
		
		String belfastEventsUrl = "http://neueda-flask.bndouglas.c9users.io/belfast-events/api/";
		
		RestTemplate restTemplate = new RestTemplate();
		BelfastEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, BelfastEvents.class);
		
		model.addAttribute("events", belfastEvents.getAllEvents());
		
		return "events";
	}
	
	@GetMapping("/{eventId}")
	public String singleEvent(Model model, @PathVariable("eventId") String eventId)
	{
		model.addAttribute("pageTitle", "Event");
		
		
		String belfastEventsUrl = "http://neueda-flask.bndouglas.c9users.io/belfast-events/api/";
		
		RestTemplate restTemplate = new RestTemplate();
		BelfastEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, BelfastEvents.class);
		Event requestedEvent = new Event();
		
		for(Event event: belfastEvents.getAllEvents())
		{
			if (event.getIdentifier().equals(eventId))
			{
				requestedEvent = event;
			}

		}
		model.addAttribute("event", requestedEvent);
		return "event";
	}
	
	
}
