package com.brunobrilhante.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunobrilhante.cursospringboot.services.exceptions.ObjectNotFoundException;

import com.brunobrilhante.cursospringboot.domain.Categoria;
import com.brunobrilhante.cursospringboot.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);	
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
		
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
