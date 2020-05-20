package br.com.alura.microservice.fornecedor.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.InfoFonecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFonecedor,Long>{
	InfoFonecedor findByEstado(String estado);
	
}
