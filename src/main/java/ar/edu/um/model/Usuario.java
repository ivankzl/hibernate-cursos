package ar.edu.um.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@Column(name = "usu_id", nullable = false)
	private int usu_id;
	
	@Column(name = "usu_uid", nullable = false)
	private String usu_uid;
	
	@Column(name = "usu_pwd", nullable = false)
	private String usu_pwd;
	
	public Usuario(){
		
	}

	public int getUsu_id() {
		return usu_id;
	}

	public void setUsu_id(int usu_id) {
		this.usu_id = usu_id;
	}

	public String getUsu_uid() {
		return usu_uid;
	}

	public void setUsu_uid(String usu_uid) {
		this.usu_uid = usu_uid;
	}

	public String getUsu_pwd() {
		return usu_pwd;
	}

	public void setUsu_pwd(String usu_pwd) {
		this.usu_pwd = usu_pwd;
	}
	
	

}
