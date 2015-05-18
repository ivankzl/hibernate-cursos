package ar.edu.um.dao;

import ar.edu.um.model.Facultad;

public interface IFacultadDAO {
	void persistFacultad (Facultad facultad);
	Facultad findFacultadByFac_ID (int Fac_ID);
}
