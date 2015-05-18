package ar.edu.um.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.um.model.Provincia;
import ar.edu.um.service.IProvinciaService;
import ar.edu.um.service.ProvinciaService;


public class App {
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Ejemplo de insert
		IProvinciaService prvService = (IProvinciaService) context.getBean("provinciaService");
		Provincia provincia = new Provincia();
		provincia.setPrv_Fac_ID(1);
		provincia.setPrv_ID(1);
		provincia.setPrv_Nombre("Mendoza");
		prvService.persistProvincia(provincia);
		*/
		context.close();
	}


}
