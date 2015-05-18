package ar.edu.um.service;

import ar.edu.um.model.Facultad;

public interface IFacultadService {

	void persistFacultad(Facultad facultad);
	Facultad findFacultadByFac_ID (int Fac_ID);
}
