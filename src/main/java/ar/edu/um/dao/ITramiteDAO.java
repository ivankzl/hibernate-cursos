package ar.edu.um.dao;

import java.util.List;

import ar.edu.um.model.Tramite;

public interface ITramiteDAO {
	void persistTramite (Tramite tramite);
	List<Tramite> list();
	Tramite getTramite(int id);
}
