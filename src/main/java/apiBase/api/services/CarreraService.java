package apiBase.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiBase.api.daos.CarreraDAO;
import apiBase.api.entities.Carrera;
import apiBase.api.interfaces.ICarreraService;

@Service
public class CarreraService implements ICarreraService<Carrera> {
	
	@Autowired
	CarreraDAO carreraDAO;

	@Override
	public List<Carrera> getAll() {
		
		List<Carrera> carreras = new ArrayList<>();
		carreras = this.carreraDAO.findAll(); 
		
		return carreras; 
	}

	@Override
	public Carrera getByid(long id) {
		Carrera carrera = this.carreraDAO.getById(id); 
		return carrera; 
	}

	@Override
	public Carrera createOrUpdate(Carrera entity) {
		Carrera carrera = entity; 
		carrera = this.carreraDAO.save(entity); 
		
		return carrera; 
	}

	@Override
	public Carrera deleteById(Long id) {
		Carrera carrera = getByid(id);  
		this.carreraDAO.deleteById(id); 
		return carrera; 
	}
	
	

}
