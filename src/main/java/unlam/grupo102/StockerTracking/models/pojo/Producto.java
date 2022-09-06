package unlam.grupo102.StockerTracking.models.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Producto {
    private String _id;
    private String nombre;
    private String descripcion;
    private int stock;
    private String precio;
    private Proveedor proveedor;
    private Estado estado;
    private String usuario;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Producto setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public Producto setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public String getPrecio() {
        return precio;
    }

    public Producto setPrecio(String precio) {
        this.precio = precio;
        return this;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Producto setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Producto setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public Producto setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }
}
