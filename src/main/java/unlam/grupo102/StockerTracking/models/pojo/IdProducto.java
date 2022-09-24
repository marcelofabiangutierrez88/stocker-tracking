package unlam.grupo102.StockerTracking.models.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdProducto{

	@JsonProperty("descripcion")
	private String descripcion;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("nombre")
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
}