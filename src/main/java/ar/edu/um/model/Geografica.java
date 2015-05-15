package ar.edu.um.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geografica")
public class Geografica {
	
	@Id
	@Column(name = "Geo_ID", nullable = false)
	private int Geo_ID;
	
	@Column(name = "Geo_Nombre", nullable = false)
	private String Geo_Nombre;
	
	public Geografica(){
		
	}

	public int getGeo_ID() {
		return Geo_ID;
	}

	public void setGeo_ID(int geo_ID) {
		Geo_ID = geo_ID;
	}

	public String getGeo_Nombre() {
		return Geo_Nombre;
	}

	public void setGeo_Nombre(String geo_Nombre) {
		Geo_Nombre = geo_Nombre;
	}

	@Override
	public String toString() {
		return "Geografica [Geo_ID=" + Geo_ID + ", Geo_Nombre=" + Geo_Nombre
				+ "]";
	}
	
	

}
