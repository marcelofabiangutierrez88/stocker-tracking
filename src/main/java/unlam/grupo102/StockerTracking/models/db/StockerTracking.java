package unlam.grupo102.StockerTracking.models.db;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection ="StockerTracking")
public class StockerTracking implements Serializable {

    @Id
    private String id;

    @Field("id_pedido")
    private String idPedido;
    @Field("direccion")
    private String direccion;
    @Field("nombre_cliente")
    private String nombreCliente;
    @Field("apellido_cliente")
    private String apellidoCliente;
    @Field("nombre_producto")
    private String nombreProducto;
    @Field("descripcion_producto")
    private String descProducto;
    @Field("fecha_entrega")
    private String fechaEntrega;
    @Field("metodo_entega")
    private String metodoEntrega;

    public String getId() {
        return id;
    }

    public StockerTracking setId(String id) {
        this.id = id;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public StockerTracking setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public StockerTracking setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        return this;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public StockerTracking setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
        return this;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public StockerTracking setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
        return this;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public StockerTracking setDescProducto(String descProducto) {
        this.descProducto = descProducto;
        return this;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public StockerTracking setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        return this;
    }

    public String getMetodoEntrega() {
        return metodoEntrega;
    }

    public StockerTracking setMetodoEntrega(String metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
        return this;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public StockerTracking setIdPedido(String idPedido) {
        this.idPedido = idPedido;
        return this;
    }
}
