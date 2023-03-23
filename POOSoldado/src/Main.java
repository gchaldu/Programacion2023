import net.youtics.poo.Persona;
import net.youtics.poo.PersonalCivil;
import net.youtics.poo.Soldado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * statica
         * polimorfismo
         * github
         * breakpoints
         * */
        Persona soldado1 = new Soldado("Gabriel Chaldu", 21, "Regimiento 1");
        Persona soldado2 = new Soldado("Gabriel Chaldu", 22, "Regimiento 1");
        Persona soldado3 = new Soldado("Gabriel Chaldu", 23, "Regimiento 1");
        Persona soldado4 = new Soldado("Gabriel Chaldu", 24, "Regimiento 1");
        Persona soldado5 = new Soldado("Gabriel Chaldu", 26, "Regimiento 1");
        /*System.out.println("soldado1.toString() = " + soldado1.toString());
        System.out.println("soldado1.toString() = " + soldado2.toString());
        System.out.println("soldado1.toString() = " + soldado3.toString());
        System.out.println("soldado1.toString() = " + soldado4.toString());*/
        Persona personalCivil = new PersonalCivil("Personal", 25,10);

        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(soldado1);
        lista.add(soldado2);
        lista.add(soldado3);
        lista.add(soldado4);
        lista.add(soldado5);
        lista.add(personalCivil);
        System.out.println(lista.toString());

        /*System.out.println("soldado.toString() = " + soldado1.toString());
        soldado1.atacar();
        System.out.println("soldado.toString() = " + soldado2.toString());
        System.out.println("soldado.toString() = " + soldado3.toString());
        System.out.println("soldado.toString() = " + soldado4.toString());
        soldado1.atacar();*/
    }
}