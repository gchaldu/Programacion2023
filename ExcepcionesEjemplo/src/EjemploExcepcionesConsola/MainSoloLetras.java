package EjemploExcepcionesConsola;

public class MainSoloLetras {
    public static void main(String[] args){
        Consola consola = new Consola();

        try {
            consola.ingreseCadena("Ingrese el nombre de Usuario");
        } catch (SoloLetrasExcepcion e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("cerrar...");
        }
        System.out.println("continua la ejecucion");


    }
}
