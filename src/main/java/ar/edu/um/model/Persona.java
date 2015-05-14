package ar.edu.um.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Persona {
	
	@Id
	@Column(name = "Per_ID", nullable = false)
	private int Per_ID;
	@Id
	@Column(name = "Per_Doc_ID", nullable = false)
	private int Per_Doc_ID;
	@Column(name = "Per_Apellido", nullable = false)
	private String Per_Apellido;
	@Column(name = "Per_Nombre", nullable = false)
	private String Per_Nombre;
	@Column(name = "Per_Sexo", nullable = false)
	private String Per_Sexo;
	@Column(name = "clave", nullable = false)
	private String clave;

}
