package com.aubadeveloper.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //paradgima relacional
@Table(name = "tb_sales") //com base no nome presente no banco de dados
public class Sale {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY) //informa ao banco que o id é autoimplementável
	private Long id;
	private Integer visited;
	private Integer deals; //negocios fechados
	private Double amount;
	private LocalDate date;
	
	@ManyToOne //define que uxsará chave estrangeira (porque tem a correlação entre Sale e Saller
	@JoinColumn(name = "seller_id") //define o nome para chave estrangeira (igual ao do codigo do banco de dados)
	private Seller seller;
	
	public Sale() { //construtor sem argumentos
	}

	
	//construtor com argumentos
	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
	}


	public Integer getDeals() {
		return deals;
	}


	public void setDeals(Integer deals) {
		this.deals = deals;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Seller getSeller() {
		return seller;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}	
}
