package ar.edu.um.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia implements Serializable{
	
	@Id
	@Column(name = "Prv_Fac_ID", nullable = false)
	private int Prv_Fac_ID;
	@Id
	@Column(name = "Prv_ID", nullable = false)
	private int Prv_ID;
	@Column(name = "Prv_Nombre", nullable = false)
	private String Prv_Nombre;
	
	
	public Provincia() {
	
	}
	public int getPrv_Fac_ID() {
		return Prv_Fac_ID;
	}
	public void setPrv_Fac_ID(int prv_Fac_ID) {
		Prv_Fac_ID = prv_Fac_ID;
	}
	public int getPrv_ID() {
		return Prv_ID;
	}
	public void setPrv_ID(int prv_ID) {
		Prv_ID = prv_ID;
	}
	public String getPrv_Nombre() {
		return Prv_Nombre;
	}
	public void setPrv_Nombre(String prv_Nombre) {
		Prv_Nombre = prv_Nombre;
	}

	
}
