package unlam.grupo102.StockerTracking.models.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalleItem{

	@JsonProperty("precio")
	private int precio;

	@JsonProperty("id_producto")
	private IdProducto idProducto;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("cantidad")
	private int cantidad;

	public int getPrecio(){
		return precio;
	}

	public IdProducto getIdProducto(){
		return idProducto;
	}

	public String getId(){
		return id;
	}

	public int getCantidad(){
		return cantidad;
	}
}