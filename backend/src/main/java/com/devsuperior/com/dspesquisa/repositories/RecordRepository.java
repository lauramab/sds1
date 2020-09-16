package com.devsuperior.com.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.com.dspesquisa.entities.Record;

public interface RecordRepository  extends JpaRepository<Record, Long>{

}
