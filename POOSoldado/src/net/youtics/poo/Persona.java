package net.youtics.poo;

public class Persona {
    private String nombreYApe;
    private Integer dni;

    public Persona() {
    }

    public Persona(String nombreYApe, Integer dni) {
        this.nombreYApe = nombreYApe;
        this.dni = dni;
    }

    public String getNombreYApe() {
        return nombreYApe;
    }

    public void setNombreYApe(String nombreYApe) {
        this.nombreYApe = nombreYApe;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre Y Apellido: " + nombreYApe + '\n' +
                "DNI: " + dni;
    }
}
