package ar.edu.um.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Tramite;
import ar.edu.um.service.ITramiteService;

@RestController
public class TramiteController {
	
	 //trae todos los tramites
	 @RequestMapping(value= "/tramites",  method = RequestMethod.GET)
	    public List<Tramite> get() {
	    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    	ITramiteService traService = (ITramiteService) context.getBean("tramiteService");
	    	List<Tramite> list = traService.list();
	    	
	    	return list;

	    }
	 
	 //trae un tramite determinado
	 @RequestMapping(value = "/tramites/{id}", method = RequestMethod.GET)
	 public Tramite findTramite(@PathVariable("id") int id) {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 ITramiteService traService = (ITramiteService) context.getBean("tramiteService");
		 Tramite tramite = traService.getTramite(id);
		 
	     return tramite;

	 }
	 //guardar un tramite nuevo
	 @RequestMapping(value="/tramites", method=RequestMethod.POST)
	 @ResponseBody
	  public String saveTramite(@RequestBody Tramite tramite) {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 ITramiteService traService = (ITramiteService) context.getBean("tramiteService");
		 traService.persistTramite(tramite);
	     
	
	     return "Saved tramite: " + tramite.toString();
	
	  }
	 /*Probar desde la consola rest. por ej: {"tra_fac_id":3,"tra_per_id":8,"tra_doc_id":1,"tra_pla_id":3,"tra_car_id":2,"tra_inicio":"2015-05-05","tra_final":"2015-08-05","tra_entregado":0,"tra_id":3}]*/

	

}
