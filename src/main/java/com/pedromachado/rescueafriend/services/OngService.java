package com.pedromachado.rescueafriend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedromachado.rescueafriend.domain.Ong;
import com.pedromachado.rescueafriend.repositories.OngRepository;

@Service
public class OngService {

	@Autowired
	private OngRepository repo;
	
	public Ong find(Integer id) {
		Optional<Ong> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
