package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Usuario;

@Service("usuarioDAO")
public class UsuarioDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().persist(usuario);
	}

}
