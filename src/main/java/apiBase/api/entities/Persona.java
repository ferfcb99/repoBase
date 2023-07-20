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
@Table(name = "persona")
public class Persona implements Serializable{ // persona - ClienteVenta - cliente_venta
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@NotNull
	@Valid
	@Column(name = "nombre", nullable = false, unique = false, length = 50)
	private String nombre;
	
	@NotNull
	@Valid
	@Column(name = "apellido", nullable = false, unique = false, length = 50)
	private String apellido;
	
	@NotNull
	@Valid
	@Column(name = "edad", nullable = false, unique = false)
	private Integer edad;
	
	
}
