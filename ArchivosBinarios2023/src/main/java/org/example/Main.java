package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @YouTics
 * @author Gabriel Chaldu
 * @version 1.0
 * */
public class Main {

    public static void main(String[] args) {
        String rutaArchivo = "./src/main/resources/persona.bin";

        // Crear una lista de Personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("John Doe", 30));
        personas.add(new Persona("Jane Smith", 25));
        personas.add(new Persona("Bob Johnson", 40));

        // Guardar la lista de Personas en un archivo binario
        guardarPersonas(personas, rutaArchivo);

        // Leer la lista de Personas desde el archivo binario
        List<Persona> personasGuardadas = leerPersonas(rutaArchivo);

        // Imprimir las Personas guardadas
        System.out.println("Personas guardadas:");
        for (Persona persona : personasGuardadas) {
            System.out.println(persona);
        }

        // Buscar una persona por nombre y actualizar su edad
        String nombreBuscar = "Nueva Persona";
        int nuevaEdad = 35;
        actualizarEdadPersona(nombreBuscar, nuevaEdad, rutaArchivo);

        // Eliminar una persona por nombre
        String nombreEliminar = "Nueva Persona";
        eliminarPersona(nombreEliminar, rutaArchivo);
    }

    public static void guardarPersona(Persona persona, String rutaArchivo) {
        //crea un flujo de salida hacia un archivo binario y lo envuelve en un
        // ObjectOutputStream, lo que te permite escribir objetos en el archivo binario.
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            // Escribir la Persona en el archivo
            oos.writeObject(persona);

            System.out.println("Persona guardada en el archivo binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarPersonas(List<Persona> personas, String rutaArchivo) {
        //crea un flujo de salida hacia un archivo binario y lo envuelve en un
        // ObjectOutputStream, lo que te permite escribir objetos en el archivo binario.
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            // Escribir la lista de Personas en el archivo
            oos.writeObject(personas);

            System.out.println("Personas guardadas en el archivo binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Persona leerPersona(String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            // Leer la Persona del archivo
            Persona persona = (Persona) ois.readObject();
            return persona;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Persona> leerPersonas(String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            // Leer la lista de Personas del archivo
            List<Persona> personas = (List<Persona>) ois.readObject();
            return personas;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void eliminarPersona(String nombre, String rutaArchivo) {
        List<Persona> personas = leerPersonas(rutaArchivo);

        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (persona.getNombre().equals(nombre)) {
                personas.remove(i);
                break;
            }
        }

        guardarPersonas(personas, rutaArchivo);
    }

    public static void actualizarEdadPersona(String nombre, int nuevaEdad, String rutaArchivo) {
        List<Persona> personas = leerPersonas(rutaArchivo);

        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (persona.getNombre().equals(nombre)) {
                persona.setEdad(nuevaEdad);
                personas.set(i, persona);
                break;
            }
        }

        guardarPersonas(personas, rutaArchivo);
    }


    // Clase Persona (ejemplo)
    // La interfaz Serializable se utiliza para marcar una clase como serializable,
    // lo que significa que los objetos de esa clase se pueden convertir en una secuencia
    // de bytes para su almacenamiento o transmisión, y luego se pueden restaurar a su
    // estado original. Al implementar la interfaz Serializable, estás indicando que los
    // objetos de esa clase se pueden serializar y deserializar.
    public static class Persona implements Serializable {
        private String nombre;
        private int edad;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }


    }
}
