package net.youtics.appInterfaces.modelo;

public abstract class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public String soyhoja() {
        return "No soy abstract";
    }

    abstract public String imprimir();
}
