package apiBase.api.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import apiBase.api.entities.Persona;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>{

    @Query("SELECT persona FROM Persona persona WHERE id = :id")
    public Persona getById(@PathVariable Long id);

}
