package apiBase.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import apiBase.api.entities.Persona;
import apiBase.api.interfaces.IPersonaController;
import apiBase.api.publics.Constants;
import apiBase.api.publics.Response;
import apiBase.api.services.PersonaService;

@RestController
@RequestMapping(path = "/personas")
// http://localhost:8084/swagger-ui/index.html#/personas
public class PersonaController implements IPersonaController<Persona> {

	@Autowired
	PersonaService personaService;

	@Override
	@ResponseStatus(HttpStatus.OK)
	// http://localhost:8084/swagger-ui/index.html#/personas/getAll
	@RequestMapping(method = RequestMethod.GET, value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<List<Persona>>> getAll() {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.personaService.getAll(),
				Constants.GET_DATA_SUCCESS));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	// http://localhost:8084/swagger-ui/index.html#/personas/getById/2
	@RequestMapping(method = RequestMethod.GET, value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<Persona>> getById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.personaService.getById(id),
				Constants.GET_DATA_SUCCESS));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST, value = "/createOrUpdate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<Persona>> createOrUpdate(@RequestBody Persona entity) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.personaService.createOrUpdate(entity),
				Constants.CREATE_DATA_SUCCESS));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<Persona>> deleteById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.personaService.deleteById(id),
				Constants.DELETE_DATA_SUCCESS));
	}

}







