package ar.edu.um.model;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tracking")
public class Tracking implements Serializable{
	@Id
	@Column(name = "tck_tra_id", nullable = false)
	private int tck_tra_id;
	
	@Id
	@Column(name = "tck_timestamp", nullable = false)
	private Timestamp tck_timestamp;
	
	@Column(name = "tck_est_id", nullable = false)
	private int tck_est_id;
	
	@Column(name = "tck_usu_id", nullable = false)
	private int tck_usu_id;
	
	@Column(name = "tck_id", nullable = false)
	private int tck_id;
	
	public Tracking(){
		
	}

	public int getTck_tra_id() {
		return tck_tra_id;
	}

	public void setTck_tra_id(int tck_tra_id) {
		this.tck_tra_id = tck_tra_id;
	}

	public Timestamp getTck_timestamp() {
		return tck_timestamp;
	}

	public void setTck_timestamp(Timestamp tck_timestamp) {
		this.tck_timestamp = tck_timestamp;
	}

	public int getTck_est_id() {
		return tck_est_id;
	}

	public void setTck_est_id(int tck_est_id) {
		this.tck_est_id = tck_est_id;
	}

	public int getTck_usu_id() {
		return tck_usu_id;
	}

	public void setTck_usu_id(int tck_usu_id) {
		this.tck_usu_id = tck_usu_id;
	}

	public int getTck_id() {
		return tck_id;
	}

	public void setTck_id(int tck_id) {
		this.tck_id = tck_id;
	}
	
	

}
