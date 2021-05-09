package com.aubadeveloper.dsvendas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aubadeveloper.dsvendas.dto.SaleDTO;
import com.aubadeveloper.dsvendas.dto.SaleSuccessDTO;
import com.aubadeveloper.dsvendas.dto.SaleSumDTO;
import com.aubadeveloper.dsvendas.entities.Sale;
import com.aubadeveloper.dsvendas.repositories.SaleRepository;
import com.aubadeveloper.dsvendas.repositories.SellerRepository;

@Service //declara SellerService como um componente, que pode ser injetado em outros componentes
public class SaleService {
	
	@Autowired //injeta a dependência de forma transparente (a instancia é criada pelo próprio framework)
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository; 
	
	@Transactional(readOnly = true) //para garantiar que a operação do banco seja raelizada no momento do service e o readonly = true é para so ter permissao de leitura
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll(); //para baixar todos os vendedores de uma so vez e armazenar na memoria
		Page <Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	  //^ = retorna a lista result com a conversão em SellerDTO. (Essa conversão fica por responsabilidade do map)
		//^ = depois de converter para SellerDTO converte de stream para lista
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
	
}
