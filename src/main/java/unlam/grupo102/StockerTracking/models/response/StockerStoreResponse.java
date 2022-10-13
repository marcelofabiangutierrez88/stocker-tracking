package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockerStoreResponse{
	private String fecha;
	@JsonProperty("id_usuario")
	private IdUsuario idUsuario;

	@JsonProperty("__v")
	private int V;
	@JsonProperty("total_venta")
	private int totalVenta;
	@JsonProperty("forma_pago")
	private String formaPago;
	private String _id;
	private List<DetalleItem> detalle;
	private String status;
	private String direccion;

	private ErrorRest errorRest;

	public ErrorRest getErrorRest() {
		return errorRest;
	}

	public StockerStoreResponse setErrorRest(ErrorRest errorRest) {
		this.errorRest = errorRest;
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

	public StockerStoreResponse setFecha(String fecha) {
		this.fecha = fecha;
		return this;
	}

	public StockerStoreResponse setIdUsuario(IdUsuario idUsuario) {
		this.idUsuario = idUsuario;
		return this;
	}

	public StockerStoreResponse setV(int v) {
		V = v;
		return this;
	}

	public StockerStoreResponse setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
		return this;
	}

	public StockerStoreResponse setFormaPago(String formaPago) {
		this.formaPago = formaPago;
		return this;
	}

	public String get_id() {
		return _id;
	}

	public StockerStoreResponse set_id(String _id) {
		this._id = _id;
		return this;
	}

	public StockerStoreResponse setDetalle(List<DetalleItem> detalle) {
		this.detalle = detalle;
		return this;
	}

	public StockerStoreResponse setStatus(String status) {
		this.status = status;
		return this;
	}

	public List<DetalleItem> getDetalle(){
		return detalle;
	}

	public String getStatus(){
		return status;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}