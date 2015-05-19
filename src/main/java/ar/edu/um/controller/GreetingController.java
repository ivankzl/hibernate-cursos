package ar.edu.um.controller;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import ar.edu.um.model.Persona;
import ar.edu.um.service.IPersonaService;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/personas")
    public List<Persona> personas() {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	IPersonaService perService = (IPersonaService) context.getBean("personaService");
    	List<Persona> list = perService.list();

    	return list;

    }
    
    
    
}
