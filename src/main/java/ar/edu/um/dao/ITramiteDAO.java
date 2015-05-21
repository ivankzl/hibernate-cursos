package ar.edu.um.dao;

import java.util.List;

import ar.edu.um.model.Tramite;

public interface ITramiteDAO {
	void persistTramite (Tramite tramite);
	public List<Tramite> list();
}
