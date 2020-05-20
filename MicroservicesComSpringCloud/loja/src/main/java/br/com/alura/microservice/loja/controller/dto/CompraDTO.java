package br.com.alura.microservice.loja.controller.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CompraDTO {
	
	@JsonIgnore
	private Long compraId;
	
	private List<ItemDaCompra> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompra> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompra> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public Long getCompraId() {
		return compraId;
	}

	public void setCompraId(Long compraId) {
		this.compraId = compraId;
	}
	
	
	
	
}