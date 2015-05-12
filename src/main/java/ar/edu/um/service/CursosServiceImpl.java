package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.CursosDAO;
import ar.edu.um.model.Curso;

@Service("cursosService")
public class CursosServiceImpl implements CursosService {

	@Autowired
	CursosDAO cursosDAO;

	@Transactional 
	public void persistCurso(Curso curso) {
		cursosDAO.persistCurso(curso);
	}

	@Transactional
	public Curso findCursoByID(int id) {
		return cursosDAO.findCursoById(id);
	}
	
	@Transactional
	public void updateCurso(Curso curso) {
		cursosDAO.updateCurso(curso);
		
	}

	@Transactional
	public void deleteCurso(Curso curso) {
		cursosDAO.deleteCurso(curso);
	}
}
