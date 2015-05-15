package ar.um.edu.controllers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.um.model.Provincia;
import ar.edu.um.service.ProvinciaService;


public class App {
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProvinciaService prvService = (ProvinciaService) context.getBean("provinciaService");
		Provincia provincia = new Provincia();
		provincia.setPrv_Fac_ID(1);
		provincia.setPrv_ID(1);
		provincia.setPrv_Nombre("Mendoza");
		prvService.persistProvincia(provincia);
//		CursosService emService = (CursosService) context.getBean("cursosService");
//		Curso curso = emService.findCursoByID(1);
//		System.out.println(curso);
		context.close();
	}


}
