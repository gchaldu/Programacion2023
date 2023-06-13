package EjemploExcepcionesConsola;

import java.util.Scanner;

public class Consola {

    private double numDouble;
    private String cadena;
    private Integer numEntero;

    public String ingreseCadena (String mensaje) throws SoloLetrasExcepcion {
        System.out.println(mensaje);
        Scanner scanner = new Scanner(System.in);
        this.cadena = scanner.nextLine();
        if (!this.cadena.matches("[a-zA-Z]*"))
        {
            throw new SoloLetrasExcepcion("Ingrese solo letras...");
        }
        return this.cadena;
    }
}
