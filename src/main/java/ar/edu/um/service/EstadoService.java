package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.EstadoDAO;
import ar.edu.um.model.Estado;

@Service("estadoService")
public class EstadoService implements IEstadoService{
	@Autowired
	EstadoDAO estadoDAO;

	@Transactional 
	public void persistEstado(Estado estado) {
		estadoDAO.persistEstado(estado);
	}

}
