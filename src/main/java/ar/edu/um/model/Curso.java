package ar.edu.um.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
	@Id
	@Column(name = "cur_id", nullable = false)
	private int cur_id;
	@Column(name = "cur_titulo", nullable = false)
	private String cur_titulo;
	@Column(name = "cur_descripcion", nullable = false)
	private String cur_descripcion;
	@Column(name = "cur_inicio", nullable = false)
	private Date cur_inicio;
	@Column(name = "cur_duracion", nullable = false)
	private int cur_duracion;
	@Column(name = "cur_profesor", nullable = false)
	private String cur_profesor;
	@Column(name = "cur_url", nullable = false)
	private String cur_url;
	
	public Curso() {
		
	}

	public int getCur_id() {
		return cur_id;
	}

	public void setCur_id(int cur_id) {
		this.cur_id = cur_id;
	}

	public String getCur_titulo() {
		return cur_titulo;
	}

	public void setCur_titulo(String cur_titulo) {
		this.cur_titulo = cur_titulo;
	}

	public String getCur_descripcion() {
		return cur_descripcion;
	}

	public void setCur_descripcion(String cur_descripcion) {
		this.cur_descripcion = cur_descripcion;
	}

	public Date getCur_inicio() {
		return cur_inicio;
	}

	public void setCur_inicio(Date cur_inicio) {
		this.cur_inicio = cur_inicio;
	}

	public int getCur_duracion() {
		return cur_duracion;
	}

	public void setCur_duracion(int cur_duracion) {
		this.cur_duracion = cur_duracion;
	}

	public String getCur_profesor() {
		return cur_profesor;
	}

	public void setCur_profesor(String cur_profesor) {
		this.cur_profesor = cur_profesor;
	}

	public String getCur_url() {
		return cur_url;
	}

	public void setCur_url(String cur_url) {
		this.cur_url = cur_url;
	}

	@Override
	public String toString() {
		return "Curso [cur_id=" + cur_id + ", cur_titulo=" + cur_titulo
				+ ", cur_descripcion=" + cur_descripcion + ", cur_inicio="
				+ cur_inicio + ", cur_duracion=" + cur_duracion
				+ ", cur_profesor=" + cur_profesor + ", cur_url=" + cur_url
				+ "]";
	}
	
	
}