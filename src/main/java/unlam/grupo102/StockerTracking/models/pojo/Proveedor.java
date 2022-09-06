package unlam.grupo102.StockerTracking.models.pojo;

public class Proveedor {
    private String nombre;
    private String direccion;
    private String cuit;
    private String email;
    private String telefono;
    private String situacion_afip;
    private Estado estado;
    private Usuario usuario;

    public String getNombre() {
        return nombre;
    }

    public Proveedor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Proveedor setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getCuit() {
        return cuit;
    }

    public Proveedor setCuit(String cuit) {
        this.cuit = cuit;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Proveedor setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Proveedor setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getSituacion_afip() {
        return situacion_afip;
    }

    public Proveedor setSituacion_afip(String situacion_afip) {
        this.situacion_afip = situacion_afip;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Proveedor setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Proveedor setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }
}
