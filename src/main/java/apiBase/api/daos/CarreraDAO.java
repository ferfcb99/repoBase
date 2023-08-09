package apiBase.api.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import apiBase.api.entities.Carrera;

public interface CarreraDAO extends JpaRepository<Carrera , Long> {
	
	@Query("SELECT carrera FROM Carrera carrera where id_carrera = :id")
	public Carrera getById(@PathVariable long id);

}
