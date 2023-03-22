import net.youtics.clases.Domicilio;
import net.youtics.clases.Estudiante;
import net.youtics.clases.Persona;

public class Main {
    public static void main(String[] args) {

       /* Persona persona = new Persona("Maria", "Garcia", 222222);
        Domicilio domicilio = new Domicilio("Independencia", "123", "MDP");
        persona.setDomicilio(domicilio);
        System.out.println("persona = " + persona.toString());*/

        Estudiante estudiante = new Estudiante("Maria", "Garcia", 222222, "456", "TUP");
        Domicilio domicilio = new Domicilio("Independencia", "123", "MDP");
        estudiante.setDomicilio(domicilio);
        System.out.println("estudiante = " + estudiante.toString());

        /** MATRICES */
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Maria";

        nombres[1][0] = "Pato";
        nombres[1][1] = "Bea";

        nombres[2][0] = "Lucas";
        nombres[2][1] = "Luci";
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("nombre = " + nombres[i][j]);
            }

        }

    }
}