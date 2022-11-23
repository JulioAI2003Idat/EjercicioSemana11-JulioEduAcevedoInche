package com.idat.docente.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.docente.dto.DocenteDTO;
import com.idat.docente.model.Docente;
import com.idat.docente.repository.DocenteRepository;
@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;

	@Override
	public List<DocenteDTO> listar() {
		List<DocenteDTO> listadto = new ArrayList<>();
		List<Docente> lista = repository.findAll();
		DocenteDTO dto = null;
		for (Docente docente : lista) {
			dto = new DocenteDTO();
			dto.setApe(docente.getApellido());
			dto.setNom(docente.getNombre());
			dto.setCod(docente.getIdDocente());
			listadto.add(dto);
		}
		return listadto;
	}

	@Override
	public DocenteDTO obtenerporId(Integer id) {
		DocenteDTO dto = null;
		Docente docente = repository.findById(id).orElse(null);
		dto = new DocenteDTO();
		dto.setApe(docente.getApellido());
		dto.setNom(docente.getNombre());
		dto.setCod(docente.getIdDocente());
		
		
		return dto;
	}

	@Override
	public void guardar(DocenteDTO a) {
		
		Docente doc = new  Docente();
		doc.setApellido(a.getApe());
		doc.setNombre(a.getNom());
		doc.setIdDocente(a.getCod());
		repository.save(doc);
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void actualizar(DocenteDTO alumno) {
		 
        Docente doc = new Docente();
        doc.setApellido(alumno.getApe());
        doc.setNombre(alumno.getNom());
        doc.setIdDocente(alumno.getCod());
        
        repository.saveAndFlush(doc);
		
	}
}
