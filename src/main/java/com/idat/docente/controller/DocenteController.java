package com.idat.docente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.docente.dto.DocenteDTO;
import com.idat.docente.service.DocenteService;

@RestController
@RequestMapping("/api/docente/v1")
public class DocenteController {
	
	@Autowired
	private DocenteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<DocenteDTO> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody DocenteDTO obtenerID(@PathVariable Integer id) {
		return service.obtenerporId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody DocenteDTO dto) {
		service.guardar(dto);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody DocenteDTO dto) {
		service.actualizar(dto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
