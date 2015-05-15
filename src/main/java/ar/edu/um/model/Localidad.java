package ar.edu.um.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad implements Serializable{
	
	@Id
	@Column(name = "Loc_Fac_ID", nullable = false)
	private int Loc_Fac_ID;

	@Id
	@Column(name = "Loc_Prv_ID", nullable = false)
	private int Loc_Prv_ID;
	
	@Id
	@Column(name = "Loc_ID", nullable = false)
	private int Loc_ID;
	
	@Column(name = "Loc_Nombre", nullable = false)
	private String Loc_Nombre;
	
	@Id
	@Column(name = "id", nullable = false)
	private int id;

	public Localidad() {
		
	}

	public int getLoc_Fac_ID() {
		return Loc_Fac_ID;
	}

	public void setLoc_Fac_ID(int loc_Fac_ID) {
		Loc_Fac_ID = loc_Fac_ID;
	}

	public int getLoc_Prv_ID() {
		return Loc_Prv_ID;
	}

	public void setLoc_Prv_ID(int loc_Prv_ID) {
		Loc_Prv_ID = loc_Prv_ID;
	}

	public int getLoc_ID() {
		return Loc_ID;
	}

	public void setLoc_ID(int loc_ID) {
		Loc_ID = loc_ID;
	}

	public String getLoc_Nombre() {
		return Loc_Nombre;
	}

	public void setLoc_Nombre(String loc_Nombre) {
		Loc_Nombre = loc_Nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
