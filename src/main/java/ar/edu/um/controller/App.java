package ar.edu.um.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.um.model.Persona;
import ar.edu.um.model.Provincia;
import ar.edu.um.service.IPersonaService;
import ar.edu.um.service.IProvinciaService;


public class App {
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Ejemplo de insert
		IProvinciaService prvService = (IProvinciaService) context.getBean("provinciaService");
		IPersonaService perService = (IPersonaService) context.getBean("personaService");
		List<Persona> list = perService.list();
        
        for(Persona p : list){
            System.out.println("Persona List::"+p);
        }
/*		Provincia provincia = new Provincia();
		provincia.setPrv_Fac_ID(1);
		provincia.setPrv_ID(1);
		provincia.setPrv_Nombre("Mendoza");
		prvService.persistProvincia(provincia);
<<<<<<< HEAD
*/
=======
		*/
>>>>>>> 6b5dab62497abad4e78a40f51f97af7a2740f953
		context.close();
	}


}
