package com.devsuperior.com.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.com.dspesquisa.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long>{

}