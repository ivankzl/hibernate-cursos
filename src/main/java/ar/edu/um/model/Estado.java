package ar.edu.um.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
	@Id
	@Column(name = "est_id", nullable = false)
	private int est_id;
	
	@Column(name = "est_nombre", nullable = false)
	private String est_nombre;
	
	@Column(name = "est_eti_id", nullable = false)
	private int est_eti_id;
	
	public Estado(){
		
	}

	public int getEst_id() {
		return est_id;
	}

	public void setEst_id(int est_id) {
		this.est_id = est_id;
	}

	public String getEst_nombre() {
		return est_nombre;
	}

	public void setEst_nombre(String est_nombre) {
		this.est_nombre = est_nombre;
	}

	public int getEst_eti_id() {
		return est_eti_id;
	}

	public void setEst_eti_id(int est_eti_id) {
		this.est_eti_id = est_eti_id;
	}

	
}
