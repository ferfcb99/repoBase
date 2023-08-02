package apiBase.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "carrera")
public class Carrera  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "id_carrera", nullable = false, unique = true)
	private Long id_carrera; 
	
	@NotNull
	@Valid
	@Column(name="nombre", nullable = false, unique = true, length = 50 )
	private String nombre;
	
	@NotNull
	@Valid
	@Column(name = "descripcion", nullable = false, unique = true, length = 100)
	private String descripcion;

	
	

}
