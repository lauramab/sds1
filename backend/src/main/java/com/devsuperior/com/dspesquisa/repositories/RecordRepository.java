package com.devsuperior.com.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.com.dspesquisa.entities.Record;

@Repository
public interface RecordRepository  extends JpaRepository<Record, Long>{

}
