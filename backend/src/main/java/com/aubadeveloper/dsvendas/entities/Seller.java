package com.aubadeveloper.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //paradgima relacional
@Table(name = "tb_sellers") //com base no nome presente no banco de dados
public class Seller {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY) //informa ao banco que o id é autoimplementável
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller") //relacionado com o nome presente na relação ManyToOne do Sale.java
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
	}

	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
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

	public List<Sale> getSales() {
		return sales;
	}
	
	
	
	
	
}
