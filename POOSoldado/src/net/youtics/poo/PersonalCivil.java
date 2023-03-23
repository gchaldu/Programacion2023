package net.youtics.poo;

public class PersonalCivil extends Persona{

    private Integer nroLegajo;

    public PersonalCivil(Integer nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public PersonalCivil(String nombreYApe, Integer dni, Integer nroLegajo) {
        super(nombreYApe, dni);
        this.nroLegajo = nroLegajo;
    }

    public Integer getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(Integer nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    @Override
    public String toString() {
        return "\n\nPersonalCivil: " +
                "NroLegajo: " + nroLegajo +
                '\n' + super.toString();
    }
}
