package com.pedromachado.rescueafriend.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedromachado.rescueafriend.domain.Ong;

@RestController
@RequestMapping(value = "/ongs")
public class OngResource {
	
	@GetMapping
	public List<Ong> listar() {
		
		Ong ong1 = new Ong(1, "Ajudando Bichinhos", "72746007");
		Ong ong2 = new Ong(2, "Petzinhos", "72736005");
		
		List<Ong> lista = new ArrayList<>();
		lista.add(ong1);
		lista.add(ong2);
		
		return lista;
	}
}
