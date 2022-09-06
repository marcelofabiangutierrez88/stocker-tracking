package unlam.grupo102.StockerTracking.models.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente {
    private String _id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String cuit;
    private String telefono;
    private String dni;
    private Usuario usuario;
    private Estado estado;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Cliente setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cliente setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cliente setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getCuit() {
        return cuit;
    }

    public Cliente setCuit(String cuit) {
        this.cuit = cuit;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Cliente setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Cliente setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Cliente setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Cliente setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }
}
