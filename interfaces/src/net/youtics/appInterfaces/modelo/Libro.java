package net.youtics.appInterfaces.modelo;

import java.util.ArrayList;

public class Libro implements Imprimible{

    private ArrayList<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public  Libro addPagina (Imprimible pagina)
    {
        this.paginas.add(pagina);
        return this;
    }

    public String imprimir()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Autor: ").append(this.autor)
                .append("\n")
                .append("Titulo: ").append(this.titulo)
                .append("\n")
                .append("Genero ").append(genero)
                .append("\n")
                .append("Paginas: ");
        for(Imprimible h: this.paginas) {
                stringBuilder.append("\n")
                        .append(h.imprimir())
                        .append("\n");
        }
        return stringBuilder.toString();
    }
}
