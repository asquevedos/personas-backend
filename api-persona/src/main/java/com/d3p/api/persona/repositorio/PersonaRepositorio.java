package com.d3p.api.persona.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d3p.api.persona.modelo.Persona;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer>{ 

}
