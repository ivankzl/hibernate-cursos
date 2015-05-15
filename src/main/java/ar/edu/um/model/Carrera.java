package ar.edu.um.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrera")
public class Carrera {

	@Id
	@Column(name = "Car_Fac_ID", nullable = false)
	private int Car_Fac_ID;
	@Column(name = "Car_Pla_ID", nullable = false)
	private int Car_Pla_ID;
	@Column(name = "Car_ID", nullable = false)
	private int Car_ID;
	@Column(name = "Car_Nombre", nullable = false)
	private String Car_Nombre;
	@Column(name = "Car_Iniciales", nullable = false)
	private String Car_Iniciales;
	@Column(name = "Car_Titulo", nullable = false)
	private String Car_Titulo;
	@Column(name = "Car_CheqUnica", nullable = false)
	private int Car_CheqUnica;
	@Column(name = "clave", nullable = false)
	private int clave;
	
	public Carrera(){
		
	}

	public int getCar_Fac_ID() {
		return Car_Fac_ID;
	}

	public void setCar_Fac_ID(int car_Fac_ID) {
		Car_Fac_ID = car_Fac_ID;
	}

	public int getCar_Pla_ID() {
		return Car_Pla_ID;
	}

	public void setCar_Pla_ID(int car_Pla_ID) {
		Car_Pla_ID = car_Pla_ID;
	}

	public int getCar_ID() {
		return Car_ID;
	}

	public void setCar_ID(int car_ID) {
		Car_ID = car_ID;
	}

	public String getCar_Nombre() {
		return Car_Nombre;
	}

	public void setCar_Nombre(String car_Nombre) {
		Car_Nombre = car_Nombre;
	}

	public String getCar_Iniciales() {
		return Car_Iniciales;
	}

	public void setCar_Iniciales(String car_Iniciales) {
		Car_Iniciales = car_Iniciales;
	}

	public String getCar_Titulo() {
		return Car_Titulo;
	}

	public void setCar_Titulo(String car_Titulo) {
		Car_Titulo = car_Titulo;
	}

	public int getCar_CheqUnica() {
		return Car_CheqUnica;
	}

	public void setCar_CheqUnica(int car_CheqUnica) {
		Car_CheqUnica = car_CheqUnica;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Carrera [Car_Fac_ID=" + Car_Fac_ID + ", Car_Pla_ID="
				+ Car_Pla_ID + ", Car_ID=" + Car_ID + ", Car_Nombre="
				+ Car_Nombre + ", Car_Iniciales=" + Car_Iniciales
				+ ", Car_Titulo=" + Car_Titulo + ", Car_CheqUnica="
				+ Car_CheqUnica + ", clave=" + clave + "]";
	}
	
	
	
	
}
