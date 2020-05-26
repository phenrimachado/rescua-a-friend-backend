package com.pedromachado.rescueafriend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedromachado.rescueafriend.domain.Ong;

@Repository
public interface OngRepository extends JpaRepository<Ong, Integer>{
}
