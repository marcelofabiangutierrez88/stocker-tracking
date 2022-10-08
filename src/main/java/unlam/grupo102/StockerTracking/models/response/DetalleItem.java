package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalleItem{
	private int precio;
	@JsonProperty("id_producto")
	private IdProducto idProducto;
	@JsonProperty("_id")
	private String id;
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

	public DetalleItem setPrecio(int precio) {
		this.precio = precio;
		return this;
	}

	public DetalleItem setIdProducto(IdProducto idProducto) {
		this.idProducto = idProducto;
		return this;
	}

	public DetalleItem setId(String id) {
		this.id = id;
		return this;
	}

	public DetalleItem setCantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
}
