package com.aubadeveloper.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aubadeveloper.dsvendas.dto.SaleSuccessDTO;
import com.aubadeveloper.dsvendas.dto.SaleSumDTO;
import com.aubadeveloper.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> { //tipo da entidade e tipo da id
	
	@Query("SELECT new com.aubadeveloper.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale  AS obj GROUP BY obj.seller") //consulta especifica
	List<SaleSumDTO> amountGroupedBySeller(); //um metodo que retorna a lista do SaleSumDTO, essa lista é apelidada de amountGroupedBySeller (mas poderia ser qlqr outro) 

	
	@Query("SELECT new com.aubadeveloper.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale  AS obj GROUP BY obj.seller") //consulta especifica
	List<SaleSuccessDTO> successGroupedBySeller(); //um metodo que retorna a lista do SaleSumDTO, essa lista é apelidada de amountGroupedBySeller (mas poderia ser qlqr outro) 

}
