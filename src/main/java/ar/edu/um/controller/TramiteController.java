package ar.edu.um.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Tramite;
import ar.edu.um.service.ITramiteService;

@RestController
public class TramiteController {
	
	 @RequestMapping("/tramites")
	    public List<Tramite> tramites() {
	    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    	ITramiteService traService = (ITramiteService) context.getBean("tramiteService");
	    	List<Tramite> list = traService.list();

	    	return list;

	    }
	    

}
