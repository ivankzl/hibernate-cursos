package ar.edu.um.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable{

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
	@Id
	@Column(name = "clave", nullable = false)
	private Integer clave;
	
	public Persona() {
		
	}
	public int getPer_ID() {
		return Per_ID;
	}
	public void setPer_ID(int per_ID) {
		Per_ID = per_ID;
	}
	public int getPer_Doc_ID() {
		return Per_Doc_ID;
	}
	public void setPer_Doc_ID(int per_Doc_ID) {
		Per_Doc_ID = per_Doc_ID;
	}
	public String getPer_Apellido() {
		return Per_Apellido;
	}
	public void setPer_Apellido(String per_Apellido) {
		Per_Apellido = per_Apellido;
	}
	public String getPer_Nombre() {
		return Per_Nombre;
	}
	public void setPer_Nombre(String per_Nombre) {
		Per_Nombre = per_Nombre;
	}
	public String getPer_Sexo() {
		return Per_Sexo;
	}
	public void setPer_Sexo(String per_Sexo) {
		Per_Sexo = per_Sexo;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	
	

}
