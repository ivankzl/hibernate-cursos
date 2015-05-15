package ar.edu.um.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluleg")
public class Aluleg {
	@Id
	@Column(name = "ALe_Per_ID", nullable = false)
	private BigDecimal ALe_Per_ID;
	@Column(name = "ALe_Doc_ID", nullable = false)
	private int ALe_Doc_ID;
	@Column(name = "ALe_Fac_ID", nullable = false)
	private int ALe_Fac_ID;
	@Column(name = "ALe_Leg_ID", nullable = false)
	private int ALe_Leg_ID;
	@Column(name = "ALe_Fecha", nullable = false)
	private Date ALe_Fecha;
	@Column(name = "ALe_Pla_ID", nullable = false)
	private int ALe_Pla_ID;
	@Column(name = "ALe_Car_ID", nullable = false)
	private int ALe_Car_ID;
	@Column(name = "ALe_Geo_ID", nullable = false)
	private int ALe_Geo_ID;
	@Column(name = "ALe_ID", nullable = false)
	private int ALe_ID;
	
	
	public Aluleg() {
		
	}


	public BigDecimal getALe_Per_ID() {
		return ALe_Per_ID;
	}


	public void setALe_Per_ID(BigDecimal aLe_Per_ID) {
		ALe_Per_ID = aLe_Per_ID;
	}


	public int getALe_Doc_ID() {
		return ALe_Doc_ID;
	}


	public void setALe_Doc_ID(int aLe_Doc_ID) {
		ALe_Doc_ID = aLe_Doc_ID;
	}


	public int getALe_Fac_ID() {
		return ALe_Fac_ID;
	}


	public void setALe_Fac_ID(int aLe_Fac_ID) {
		ALe_Fac_ID = aLe_Fac_ID;
	}


	public int getALe_Leg_ID() {
		return ALe_Leg_ID;
	}


	public void setALe_Leg_ID(int aLe_Leg_ID) {
		ALe_Leg_ID = aLe_Leg_ID;
	}


	public Date getALe_Fecha() {
		return ALe_Fecha;
	}


	public void setALe_Fecha(Date aLe_Fecha) {
		ALe_Fecha = aLe_Fecha;
	}


	public int getALe_Pla_ID() {
		return ALe_Pla_ID;
	}


	public void setALe_Pla_ID(int aLe_Pla_ID) {
		ALe_Pla_ID = aLe_Pla_ID;
	}


	public int getALe_Car_ID() {
		return ALe_Car_ID;
	}


	public void setALe_Car_ID(int aLe_Car_ID) {
		ALe_Car_ID = aLe_Car_ID;
	}


	public int getALe_Geo_ID() {
		return ALe_Geo_ID;
	}


	public void setALe_Geo_ID(int aLe_Geo_ID) {
		ALe_Geo_ID = aLe_Geo_ID;
	}


	public int getALe_ID() {
		return ALe_ID;
	}


	public void setALe_ID(int aLe_ID) {
		ALe_ID = aLe_ID;
	}


	@Override
	public String toString() {
		return "Aluleg [ALe_Per_ID=" + ALe_Per_ID + ", ALe_Doc_ID="
				+ ALe_Doc_ID + ", ALe_Fac_ID=" + ALe_Fac_ID + ", ALe_Leg_ID="
				+ ALe_Leg_ID + ", ALe_Fecha=" + ALe_Fecha + ", ALe_Pla_ID="
				+ ALe_Pla_ID + ", ALe_Car_ID=" + ALe_Car_ID + ", ALe_Geo_ID="
				+ ALe_Geo_ID + ", ALe_ID=" + ALe_ID + "]";
	}
	
	
	
}