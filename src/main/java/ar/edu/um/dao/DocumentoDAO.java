package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Documento;

@Service("documentoDAO")
public class DocumentoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistDocumento(Documento documento) {
		sessionFactory.getCurrentSession().persist(documento);
	}

}
