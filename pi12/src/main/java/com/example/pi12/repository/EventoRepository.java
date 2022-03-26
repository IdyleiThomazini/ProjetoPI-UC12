package com.example.pi12.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.pi12.models.Evento;

public interface EventoRepository extends CrudRepository<Evento,
String>{Evento findByCodigo(long codigo);


}

