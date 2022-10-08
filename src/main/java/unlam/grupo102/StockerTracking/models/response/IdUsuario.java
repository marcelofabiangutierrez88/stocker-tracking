package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdUsuario{
	private String apellido;
	@JsonProperty("_id")
	private String id;
	private String nombre;
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
