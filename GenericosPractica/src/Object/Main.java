package Object;

import models.Persona;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista(10);
        lista.add(new Persona("Maria", 20));
        lista.add(new Persona("Ana", 21));
        lista.add(new Persona("Estela", 22));
        lista.add(new Persona("Marta", 23));
        lista.mostrar();
        try{
            Object persona = lista.remove(10);
            System.out.println("persona = " + ((Persona)persona).getNombre());
        }catch (NullPointerException np)
        {
            System.out.println("np.getMessage() = " + np.getMessage());
        }
        lista.mostrar();

        Lista listaNumeros = new Lista(10);
        listaNumeros.add(1);
        listaNumeros.add("Gabriel");
        listaNumeros.add(true);
        listaNumeros.mostrar();



    }
}