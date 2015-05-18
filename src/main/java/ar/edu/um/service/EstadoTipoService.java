package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.EstadoTipoDAO;
import ar.edu.um.model.EstadoTipo;

public class EstadoTipoService implements IEstadoTipoService {
	@Autowired
	EstadoTipoDAO estadoTipoDAO;

	@Transactional 
	public void persistEstadoTipo(EstadoTipo estadoTipo) {
		estadoTipoDAO.persistEstadoTipo(estadoTipo);
	}
}
