package ar.um.edu.controllers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CursosService emService = (CursosService) context.getBean("cursosService");
		Curso curso = emService.findCursoByID(1);
		System.out.println(curso);
		context.close();
	}


}
