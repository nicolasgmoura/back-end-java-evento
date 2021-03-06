package com.evento.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evento.apirest.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	Evento findById(long id);

}
