package ar.edu.um.service;

import ar.edu.um.model.Curso;


public interface CursosService {
	
	void persistCurso (Curso curso);
	Curso findCursoByID (int id);
	void updateCurso (Curso curso);
	void deleteCurso (Curso curso);
	

}
