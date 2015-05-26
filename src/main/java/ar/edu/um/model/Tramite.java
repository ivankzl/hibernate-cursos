package ar.edu.um.model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tramite")
public class Tramite implements Serializable{
	
	@Id
	@Column(name = "tra_fac_id", nullable = false)
	private int tra_fac_id;
	
	@Id
	@Column(name = "tra_per_id", nullable = false)
	private int tra_per_id;
	
	@Id
	@Column(name = "tra_doc_id", nullable = false)
	private int tra_doc_id;
	
	@Id
	@Column(name = "tra_pla_id", nullable = false)
	private int tra_pla_id;
	
	@Id
	@Column(name = "tra_car_id", nullable = false)
	private int tra_car_id;
	
	@Column(name = "tra_inicio", nullable = false)
	private Date tra_inicio;
	
	@Column(name = "tra_final", nullable = true)
	private Date tra_final;
	
	@Column(name = "tra_entregado", nullable = false)
	private int tra_entregado;
	
	@Column(name = "tra_id", nullable = false)
	private int tra_id;
	
	public Tramite(){
		
	}

	public int getTra_fac_id() {
		return tra_fac_id;
	}

	public void setTra_fac_id(int tra_fac_id) {
		this.tra_fac_id = tra_fac_id;
	}

	public int getTra_per_id() {
		return tra_per_id;
	}

	public void setTra_per_id(int tra_per_id) {
		this.tra_per_id = tra_per_id;
	}

	public int getTra_doc_id() {
		return tra_doc_id;
	}

	public void setTra_doc_id(int tra_doc_id) {
		this.tra_doc_id = tra_doc_id;
	}

	public int getTra_pla_id() {
		return tra_pla_id;
	}

	public void setTra_pla_id(int tra_pla_id) {
		this.tra_pla_id = tra_pla_id;
	}

	public int getTra_car_id() {
		return tra_car_id;
	}

	public void setTra_car_id(int tra_car_id) {
		this.tra_car_id = tra_car_id;
	}

	public Date getTra_inicio() {
		return tra_inicio;
	}

	public void setTra_inicio(Date tra_inicio) {
		this.tra_inicio = tra_inicio;
	}

	public Date getTra_final() {
		return tra_final;
	}

	public void setTra_final(Date tra_final) {
		this.tra_final = tra_final;
	}

	public int getTra_entregado() {
		return tra_entregado;
	}

	public void setTra_entregado(int tra_entregado) {
		this.tra_entregado = tra_entregado;
	}

	public int getTra_id() {
		return tra_id;
	}

	public void setTra_id(int tra_id) {
		this.tra_id = tra_id;
	}

	@Override
	public String toString() {
		return "Tramite [tra_fac_id=" + tra_fac_id + ", tra_per_id="
				+ tra_per_id + ", tra_doc_id=" + tra_doc_id + ", tra_pla_id="
				+ tra_pla_id + ", tra_car_id=" + tra_car_id + ", tra_inicio="
				+ tra_inicio + ", tra_final=" + tra_final + ", tra_entregado="
				+ tra_entregado + ", tra_id=" + tra_id + "]";
	}
	
	
	

}
