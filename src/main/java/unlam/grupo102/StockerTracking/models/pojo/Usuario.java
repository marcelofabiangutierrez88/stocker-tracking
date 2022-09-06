package unlam.grupo102.StockerTracking.models.pojo;

public class Usuario {
    private String nombre;
    private String apellido;
    private String empresa;
    private String email;
    private String password;
    private String direccion;
    private String cuit;
    private String telefono;
    private String dni;

    public String getNombre() {
        return nombre;
    }

    public Usuario setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Usuario setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Usuario setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Usuario setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getCuit() {
        return cuit;
    }

    public Usuario setCuit(String cuit) {
        this.cuit = cuit;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Usuario setDni(String dni) {
        this.dni = dni;
        return this;
    }
}
