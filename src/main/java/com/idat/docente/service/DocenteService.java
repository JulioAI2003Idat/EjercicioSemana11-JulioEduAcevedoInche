package com.idat.docente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.docente.dto.DocenteDTO;


public interface DocenteService {

	
	List<DocenteDTO> listar();
	DocenteDTO obtenerporId(Integer id);
	void guardar(DocenteDTO a);
	void eliminar(Integer id);
	void actualizar(DocenteDTO alumno);
}
