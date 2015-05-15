package ar.edu.um.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "facultad")
public class Facultad {
	
	@Id
	@Column(name = "Fac_ID", nullable = false)
	private int Fac_ID;
	
	@Column(name = "Fac_Nombre", nullable = false)
	private String Fac_Nombre;
	
	@Column(name = "Fac_Server", nullable = false)
	private String Fac_Server;
	
	@Column(name = "Fac_DB_ADM", nullable = false)
	private String Fac_DB_ADM;
	
	@Column(name = "Fac_DNS", nullable = false)
	private String Fac_DNS;
	
	public Facultad() {
		
	}

	public int getFac_ID() {
		return Fac_ID;
	}

	public void setFac_ID(int fac_ID) {
		Fac_ID = fac_ID;
	}

	public String getFac_Nombre() {
		return Fac_Nombre;
	}

	public void setFac_Nombre(String fac_Nombre) {
		Fac_Nombre = fac_Nombre;
	}

	public String getFac_Server() {
		return Fac_Server;
	}

	public void setFac_Server(String fac_Server) {
		Fac_Server = fac_Server;
	}

	public String getFac_DB_ADM() {
		return Fac_DB_ADM;
	}

	public void setFac_DB_ADM(String fac_DB_ADM) {
		Fac_DB_ADM = fac_DB_ADM;
	}

	public String getFac_DNS() {
		return Fac_DNS;
	}

	public void setFac_DNS(String fac_DNS) {
		Fac_DNS = fac_DNS;
	}

	@Override
	public String toString() {
		return "Facultad [Fac_ID=" + Fac_ID + ", Fac_Nombre=" + Fac_Nombre
				+ ", Fac_Server=" + Fac_Server + ", Fac_DB_ADM=" + Fac_DB_ADM
				+ ", Fac_DNS=" + Fac_DNS + "]";
	}
	
	
	
	
	
}
