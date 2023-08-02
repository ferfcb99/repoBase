package apiBase.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiBase.api.daos.PersonaDao;
import apiBase.api.entities.Persona;
import apiBase.api.interfaces.IPersonaService;

@Service
public class PersonaService implements IPersonaService<Persona>{

    @Autowired
    PersonaDao personaDao;

    @Override
    public List<Persona> getAll() {
        List<Persona> personas = new ArrayList<>();
        personas = this.personaDao.findAll();
        return personas;
    }

    @Override
    public Persona getById(Long id) {
        Persona persona = this.personaDao.getById(id);
        return persona;
    }

    @Override
    public Persona createOrUpdate(Persona entity) {
        Persona persona = entity;
        this.personaDao.save(entity);
        return persona;
    }

    @Override
    public Persona deleteById(Long id) {
        Persona persona = getById(id);
        this.personaDao.deleteById(id);
        return persona;
    }


}
