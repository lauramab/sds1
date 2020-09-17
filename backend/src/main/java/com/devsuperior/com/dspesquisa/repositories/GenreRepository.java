package com.devsuperior.com.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.com.dspesquisa.entities.Genre;

@Repository
public interface GenreRepository  extends JpaRepository<Genre, Long>{

}
