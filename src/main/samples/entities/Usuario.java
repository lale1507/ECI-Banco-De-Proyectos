package samples.entities;

public class Usuario{
    private String nombre;
    private String correo;
    private String contraseña;
    private String rol;

    private Usuario(String nombre, String correo, String contraseña, String rol){
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
