package com.aubadeveloper.dsvendas.dto;

import java.io.Serializable;

import com.aubadeveloper.dsvendas.entities.Seller;

public class SellerDTO implements Serializable { //lança a api para o front end
	private static final long serialVersionUID = 1L;
	
	private Long id; //(***-*)
	private String name;
	
	public SellerDTO() {
	}

	public SellerDTO(Long id, String name) {
		this.id = id; //this é para evitar ambiguidade entre o id presente no parâmetro e o id do atribuito (marcado com ***-*)
		this.name = name;
	}
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
