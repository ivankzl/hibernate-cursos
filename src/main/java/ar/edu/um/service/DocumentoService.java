package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.DocumentoDAO;
import ar.edu.um.model.Documento;

@Service("documentoService")
public class DocumentoService implements IDocumentoService {
	
	@Autowired
	DocumentoDAO documentoDAO;

	@Transactional 
	public void persistDocumento(Documento documento) {
		documentoDAO.persistDocumento (documento);
	}
	
}
