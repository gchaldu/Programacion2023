package net.youtics.appInterfaces.modelo;

public class Informe extends Hoja implements Imprimible{
    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Autor: " + this.autor +
                "\nRevisado por: " + this.revisor +
                "\n" + contenido;
    }
}
