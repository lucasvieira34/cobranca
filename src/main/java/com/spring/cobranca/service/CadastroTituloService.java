package com.spring.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.spring.cobranca.model.Titulo;
import com.spring.cobranca.repository.TituloRepository;

@Service
public class CadastroTituloService {
	
	@Autowired
	private TituloRepository tituloRepository;
	
	public void salvar(Titulo titulo) {
		try {
			tituloRepository.save(titulo);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválida.");
		}
	}

	public void excluir(Long codigo) {
		tituloRepository.deleteById(codigo);
	}

}
