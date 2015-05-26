package ar.edu.um.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Tracking;
import ar.edu.um.service.ITrackingService;



@RestController
public class TrackingController {

	//trae todos los tracking
	 @RequestMapping(value= "/tracking",  method = RequestMethod.GET)
	 public List<Tracking> get() {
		    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		    ITrackingService trackingService = (ITrackingService) context.getBean("trackingService");
		    List<Tracking> list = trackingService.list();
		    	
		    return list;

	 }
	
}
