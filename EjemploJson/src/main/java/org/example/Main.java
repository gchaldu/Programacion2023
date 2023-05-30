package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        getPersonas();
        actualizar();
        getPersonas();
    }

    public static void getPersonas()
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Lee el JSON desde un archivo
            Persona[] personas = objectMapper.readValue(new File("src/main/resources/persona.json"), Persona[].class);

            // Accede a los objetos Persona
            for (Persona persona : personas) {
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido: " + persona.getApellido());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void actualizar()
    {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Persona> personas = new ArrayList<>();

        try {
            // Lee el JSON desde un archivo y conviértelo a un arreglo de objetos Persona
            Persona[] personasArray = objectMapper.readValue(new File("src/main/resources/persona.json"), Persona[].class);
            personas.addAll(Arrays.asList(personasArray));

            // Crea un nuevo objeto Persona
            Persona nuevaPersona = new Persona("Camila", "García", 28);

            // Agrega el nuevo objeto Persona al arreglo existente
            personas.add(nuevaPersona);

            // Convierte el arreglo actualizado de objetos Persona a JSON
            String jsonActualizado = objectMapper.writeValueAsString(personas);

            // Escribe el JSON resultante en el archivo para reemplazar su contenido existente
            FileWriter fileWriter = new FileWriter("src/main/resources/persona.json");
            fileWriter.write(jsonActualizado);
            fileWriter.close();

            System.out.println("Archivo actualizado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}