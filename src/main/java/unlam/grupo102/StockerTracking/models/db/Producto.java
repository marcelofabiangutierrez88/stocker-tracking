package unlam.grupo102.StockerTracking.models.db;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Producto {
    private String nombreProducto;
    private String descripcionProducto;
    private int cantidad;
    private int precio;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Producto setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
        return this;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public Producto setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public Producto setPrecio(int precio) {
        this.precio = precio;
        return this;
    }
}
