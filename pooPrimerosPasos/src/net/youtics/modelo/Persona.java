package net.youtics.modelo;

public class Persona {

    public String nombre;
    public String apellido;
    protected Integer dni;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, Integer dni) {
        this(nombre, apellido);
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "DNI: " + dni;
    }
}
