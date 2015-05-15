package ar.edu.um.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lectivo")
public class Lectivo {
	
	@Id
	@Column(name = "Lec_ID", nullable = false)
	private int Lec_ID;
	
	@Column(name = "Lec_Nombre", nullable = false)
	private String Lec_Nombre;
	
	@Column(name = "Lec_Inicio", nullable = false)
	private Date Lec_Inicio;
	
	@Column(name = "Lec_Fin", nullable = false)
	private Date Lec_Fin;
	
	public Lectivo(){
		
	}

	public int getLec_ID() {
		return Lec_ID;
	}

	public void setLec_ID(int lec_ID) {
		Lec_ID = lec_ID;
	}

	public String getLec_Nombre() {
		return Lec_Nombre;
	}

	public void setLec_Nombre(String lec_Nombre) {
		Lec_Nombre = lec_Nombre;
	}

	public Date getLec_Inicio() {
		return Lec_Inicio;
	}

	public void setLec_Inicio(Date lec_Inicio) {
		Lec_Inicio = lec_Inicio;
	}

	public Date getLec_Fin() {
		return Lec_Fin;
	}

	public void setLec_Fin(Date lec_Fin) {
		Lec_Fin = lec_Fin;
	}

	@Override
	public String toString() {
		return "Lectivo [Lec_ID=" + Lec_ID + ", Lec_Nombre=" + Lec_Nombre
				+ ", Lec_Inicio=" + Lec_Inicio + ", Lec_Fin=" + Lec_Fin + "]";
	}
	
	
	
}
