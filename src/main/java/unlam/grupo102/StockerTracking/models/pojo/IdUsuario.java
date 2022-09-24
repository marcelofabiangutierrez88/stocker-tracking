package unlam.grupo102.StockerTracking.models.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdUsuario{

	@JsonProperty("apellido")
	private String apellido;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("nombre")
	private String nombre;

	@JsonProperty("email")
	private String email;

	public String getApellido(){
		return apellido;
	}

	public String getId(){
		return id;
	}

	public String getNombre(){
		return nombre;
	}

	public String getEmail(){
		return email;
	}
}