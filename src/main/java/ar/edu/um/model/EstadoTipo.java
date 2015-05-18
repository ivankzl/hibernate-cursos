package ar.edu.um.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estadotipo")
public class EstadoTipo {
	
	@Id
	@Column(name = "eti_id", nullable = false)
	private int eti_id;

	@Column(name = "eti_nombre", nullable = false)
	private String eti_nombre;
	
	public EstadoTipo(){
		
	}

	public int getEti_id() {
		return eti_id;
	}

	public void setEti_id(int eti_id) {
		this.eti_id = eti_id;
	}

	public String getEti_nombre() {
		return eti_nombre;
	}

	public void setEti_nombre(String eti_nombre) {
		this.eti_nombre = eti_nombre;
	}
	
	
}
