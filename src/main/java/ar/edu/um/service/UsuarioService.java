package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.UsuarioDAO;
import ar.edu.um.model.Usuario;

public class UsuarioService implements IUsuarioService{
	@Autowired
	UsuarioDAO usuarioDAO;

	@Transactional 
	public void persistUsuario(Usuario usuario) {
		usuarioDAO.persistUsuario(usuario);
	}


}
