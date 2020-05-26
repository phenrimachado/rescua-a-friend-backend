package com.pedromachado.rescueafriend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedromachado.rescueafriend.domain.Ong;
import com.pedromachado.rescueafriend.services.OngService;

@RestController
@RequestMapping(value = "/ongs")
public class OngResource {
	
	@Autowired
	OngService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Ong obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
