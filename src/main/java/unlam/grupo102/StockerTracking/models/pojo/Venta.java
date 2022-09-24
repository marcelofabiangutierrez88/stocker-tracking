package unlam.grupo102.StockerTracking.models.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Venta {

	@JsonProperty("fecha")
	private String fecha;

	@JsonProperty("id_usuario")
	private IdUsuario idUsuario;

	@JsonProperty("__v")
	private int V;

	@JsonProperty("total_venta")
	private int totalVenta;

	@JsonProperty("forma_pago")
	private String formaPago;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("detalle")
	private List<DetalleItem> detalle;

	@JsonProperty("status")
	private String status;

	public Venta setFecha(String fecha) {
		this.fecha = fecha;
		return this;
	}

	public Venta setIdUsuario(IdUsuario idUsuario) {
		this.idUsuario = idUsuario;
		return this;
	}

	public Venta setV(int v) {
		V = v;
		return this;
	}

	public Venta setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
		return this;
	}

	public Venta setFormaPago(String formaPago) {
		this.formaPago = formaPago;
		return this;
	}

	public Venta setId(String id) {
		this.id = id;
		return this;
	}

	public Venta setDetalle(List<DetalleItem> detalle) {
		this.detalle = detalle;
		return this;
	}

	public Venta setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getFecha(){
		return fecha;
	}

	public IdUsuario getIdUsuario(){
		return idUsuario;
	}

	public int getV(){
		return V;
	}

	public int getTotalVenta(){
		return totalVenta;
	}

	public String getFormaPago(){
		return formaPago;
	}

	public String getId(){
		return id;
	}

	public List<DetalleItem> getDetalle(){
		return detalle;
	}

	public String getStatus(){
		return status;
	}
}