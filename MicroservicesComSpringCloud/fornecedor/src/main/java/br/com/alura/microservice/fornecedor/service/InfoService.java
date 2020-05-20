package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.InfoFonecedor;

@Service
public class InfoService {

	@Autowired
	private InfoRepository inforepository;
	
	public InfoFonecedor getInfoPorEstado(String estado) {
		
		return inforepository.findByEstado(estado);
	}

	
	
	
}
