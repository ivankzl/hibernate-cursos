package ar.edu.um.dao;

import ar.edu.um.model.Curso;

public interface CursosDAO {

	void persistCurso (Curso curso);
	Curso findCursoById (int id);
	void updateCurso (Curso curso);
	void deleteCurso (Curso curso);
}
