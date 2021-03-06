package com.yacov.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yacov.cursomc.domain.Categoria;

@Repository
public interface CategoryRepository extends JpaRepository<Categoria, Integer> {

}
