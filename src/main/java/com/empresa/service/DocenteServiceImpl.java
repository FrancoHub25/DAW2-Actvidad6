package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Docente;
import com.empresa.entity.FiltroDocente;
import com.empresa.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;

	@Override
	public List<Docente> listaDocente() {
		return repository.findAll();
	}

	@Override
	public Docente insertaActualizaDocente(Docente obj) {
		return repository.save(obj);
	}

	@Override
	public List<Docente> listaDocentePorDni(String dni) {
		// TODO Auto-generated method stub
		return repository.findByDni(dni);
	}

	@Override
	public List<Docente> listaDocentePorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombreContaining(nombre);
	}

	@Override
	public List<Docente> listaDocentePorDniNombre(String dni, String nombre) {
		// TODO Auto-generated method stub
		return repository.listaDocentePorDniNombre(dni, nombre);
	}

	@Override
	public List<Docente> listaDocentePorDniNombreUbigeo(String dni, String nombre, int idUbigeo) {
		// TODO Auto-generated method stub
		return repository.listaDocentePorDniNombreUbigeo(dni, nombre, idUbigeo);
	}

	@Override
	public List<Docente> listaPorFiltro(FiltroDocente filtro) {
		// TODO Auto-generated method stub
		return repository.listaPorFiltro(filtro);
	}

}
