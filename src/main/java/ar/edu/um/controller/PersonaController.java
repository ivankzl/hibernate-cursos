package ar.edu.um.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ar.edu.um.model.Persona;
import ar.edu.um.service.IPersonaService;

@RestController
public class PersonaController {

    @RequestMapping("/personas")
    public List<Persona> personas() {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	IPersonaService perService = (IPersonaService) context.getBean("personaService");
    	List<Persona> list = perService.list();

    	return list;

    }
    
    
    
}
