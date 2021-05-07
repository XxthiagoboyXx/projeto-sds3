package com.aubadeveloper.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aubadeveloper.dsvendas.dto.SellerDTO;
import com.aubadeveloper.dsvendas.entities.Seller;
import com.aubadeveloper.dsvendas.repositories.SellerRepository;

@Service //declara SellerService como um componente, que pode ser injetado em outros componentes
public class SellerService {
	
	@Autowired //injeta a dependência de forma transparente (a instancia é criada pelo próprio framework)
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List <Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	  //^ = retorna a lista result com a conversão em SellerDTO. (Essa conversão fica por responsabilidade do map)
		//^ = depois de converter para SellerDTO converte de stream para lista
	}
}
