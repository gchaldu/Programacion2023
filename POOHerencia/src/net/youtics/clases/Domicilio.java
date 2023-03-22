package net.youtics.clases;

public class Domicilio {

    protected String Calle;
    protected String nro;
    protected String localidad;

    public Domicilio(String calle, String nro, String localidad) {
        Calle = calle;
        this.nro = nro;
        this.localidad = localidad;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Calle: " + Calle + '\n' +
                "Nro: " + nro + '\n' +
                "Localidad: " + localidad;
    }
}
