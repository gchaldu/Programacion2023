package net.youtics.clases;

public class Estudiante extends Persona {

    protected String nroLegajo;
    protected String carrera;
    public Estudiante(String nombre, String apellido, Integer dni, String nroLegajo, String carrera) {
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
        this.carrera = carrera;
    }

    public String getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(String nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nroLegajo='" + nroLegajo + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", domicilio=" + domicilio +
                '}';
    }
}
