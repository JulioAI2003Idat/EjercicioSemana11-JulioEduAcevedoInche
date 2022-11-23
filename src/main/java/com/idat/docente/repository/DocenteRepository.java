package com.idat.docente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.docente.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer>{

}
