package Generic;

import models.Persona;

public class MainGeneric {
    public static void main(String[] args) {
        ListaGenerica<Persona> listaGenerica = new ListaGenerica<>(10);
        listaGenerica.add(new Persona("Maria", 20));
        listaGenerica.add(new Persona("Analia", 23));
        listaGenerica.add(new Persona("Marta", 25));
        try{

            Persona p = listaGenerica.get(10);
            System.out.println("p.getNombre() = " + p.getNombre());
        }catch (NullPointerException e)
        {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        listaGenerica.mostrar();

        ListaGenerica<Integer> listNumeros = new ListaGenerica<Integer>(10);
        listNumeros.add(103);
        listNumeros.add(102);
        listNumeros.add(101);
        listNumeros.add(100);
        listNumeros.mostrar();

    }
}
