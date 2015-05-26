package ar.edu.um.service;

import java.util.List;

import ar.edu.um.model.Tramite;

public interface ITramiteService {
	void persistTramite(Tramite tramite);
	List<Tramite> list();
	Tramite getTramite(int id);
}
