package ar.edu.um.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento {
	@Id
	@Column(name = "Doc_ID", nullable = false)
	private int Doc_ID;
	@Column(name = "Doc_Nombre", nullable = false)
	private String Doc_Nombre;

}
