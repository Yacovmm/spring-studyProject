package com.yacov.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yacov.cursomc.domain.Categoria;
import com.yacov.cursomc.repositories.CategoryRepository;
import com.yacov.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Object not found! ID: " + id 
					+ ", Type: " + Categoria.class.getName());
		}
		return obj;
	}

}
