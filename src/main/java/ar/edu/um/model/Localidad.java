package ar.edu.um.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad {
	
	@Column(name = "Loc_Fac_ID", nullable = false)
	private int Loc_Fac_ID;

	@Column(name = "Loc_Prv_ID", nullable = false)
	private int Loc_Prv_ID;
	
	@Column(name = "Loc_ID", nullable = false)
	private int Loc_ID;
	
	@Column(name = "Loc_Nombre", nullable = false)
	private String Loc_Nombre;
	
	@Column(name = "id", nullable = false)
	private int id;
	
}
