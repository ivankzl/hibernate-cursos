package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Curso;

@Service("cursosDAO")
public class CursosDAOImpl implements CursosDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCurso(Curso curso) {
		sessionFactory.getCurrentSession().persist(curso);
		
	}

	public Curso findCursoById(int id) {
		return (Curso)sessionFactory.getCurrentSession().get(Curso.class, id);
	}

	public void updateCurso(Curso curso) {
		sessionFactory.getCurrentSession().update(curso);
		
	}

	public void deleteCurso(Curso curso) {
		sessionFactory.getCurrentSession().delete(curso);
		
	}


}
