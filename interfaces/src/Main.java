import net.youtics.appInterfaces.modelo.*;

public class Main {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Contenido CV", "Leo Messi", "PSG");
        cv.addExperiencia("Campeon Mundial");
        cv.addExperiencia("7 Balones de oro");
        cv.addExperiencia("Barcelona");
        imprimir(cv);
        Informe inf = new Informe("Contenido del informe", "Dibu Martinez", "Rodrigo De Paul");
        imprimir(inf);

        Libro libro = new Libro("Sabato", "El tunel", Genero.CIENCIA_FICCION);
        libro.addPagina(new Pagina("Pagina 1"))
                .addPagina(new Pagina("Pagina 2"))
                .addPagina(new Pagina("Pagina 3"))
                .addPagina(new Pagina("Pagina 4"));
        imprimir(libro);
    }


    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}