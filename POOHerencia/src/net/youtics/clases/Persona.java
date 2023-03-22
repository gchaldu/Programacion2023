package net.youtics.clases;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected final Integer dni;
    protected Domicilio domicilio;

    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return  "Nombre: " + this.nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "DNI: " + dni + '\n' +
                domicilio.toString();
    }
}
