package com.aubadeveloper.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aubadeveloper.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller,Long> { //tipo da entidade e tipo da id

}
