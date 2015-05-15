package ar.edu.um.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Plan implements Serializable{
	
	@Id
	@Column(name = "Pla_Fac_ID", nullable = false)
	private int Pla_Fac_ID;
	@Id
	@Column(name = "Pla_ID", nullable = false)
	private int Pla_ID;
	@Column(name = "Pla_Nombre", nullable = false)
	private String Pla_Nombre;
	@Column(name = "Pla_Fecha", nullable = false)
	private Date Pla_Fecha;
	@Column(name = "Pla_Publicar", nullable = false)
	private int Pla_Publicar;
	@Column(name = "clave", nullable = false)
	private int clave;
	
	public Plan() {

	}

	public int getPla_Fac_ID() {
		return Pla_Fac_ID;
	}

	public void setPla_Fac_ID(int pla_Fac_ID) {
		Pla_Fac_ID = pla_Fac_ID;
	}

	public int getPla_ID() {
		return Pla_ID;
	}

	public void setPla_ID(int pla_ID) {
		Pla_ID = pla_ID;
	}

	public String getPla_Nombre() {
		return Pla_Nombre;
	}

	public void setPla_Nombre(String pla_Nombre) {
		Pla_Nombre = pla_Nombre;
	}

	public Date getPla_Fecha() {
		return Pla_Fecha;
	}

	public void setPla_Fecha(Date pla_Fecha) {
		Pla_Fecha = pla_Fecha;
	}

	public int getPla_Publicar() {
		return Pla_Publicar;
	}

	public void setPla_Publicar(int pla_Publicar) {
		Pla_Publicar = pla_Publicar;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	
	
	
}
