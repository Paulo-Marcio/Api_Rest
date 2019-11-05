package com.politico.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.politico.apirest.models.Politico;

public interface PoliticoRepository extends JpaRepository<Politico, Long>{


}
