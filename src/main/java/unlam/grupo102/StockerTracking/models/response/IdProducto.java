package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdProducto{
	private String descripcion;
	@JsonProperty("_id")
	private String id;
	private String nombre;

	public String getDescripcion(){
		return descripcion;
	}

	public String getId(){
		return id;
	}

	public String getNombre(){
		return nombre;
	}

	public IdProducto setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	public IdProducto setId(String id) {
		this.id = id;
		return this;
	}

	public IdProducto setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
}
