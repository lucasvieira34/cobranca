package com.spring.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.cobranca.model.Titulo;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, Long>{

}
