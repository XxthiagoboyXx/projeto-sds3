package com.aubadeveloper.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aubadeveloper.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> { //tipo da entidade e tipo da id

}
