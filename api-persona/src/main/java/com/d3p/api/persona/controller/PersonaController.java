package com.d3p.api.persona.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d3p.api.persona.modelo.Persona;
import com.d3p.api.persona.repositorio.PersonaRepositorio;


@RestController
@CrossOrigin({"*"})
public class PersonaController {

	@Autowired 
	PersonaRepositorio personaRepositorio;

	
	@GetMapping("/personas")
	public List<Persona> getAllClientes()
	{	
		List<Persona> personas = personaRepositorio.findAll();
		return personas;
	}
	
	
	@PostMapping("/save/persona")
	public ResponseEntity<String> pruebaPost(@RequestBody Persona persona) {
		try {
			personaRepositorio.save(persona);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<String>("Error",HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity<String>("Se envió con exito",HttpStatus.OK);
		
	}
	

	
	

}