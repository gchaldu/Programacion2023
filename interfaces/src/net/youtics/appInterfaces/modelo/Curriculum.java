package net.youtics.appInterfaces.modelo;

import java.util.ArrayList;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private ArrayList<String> experiencia;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculum addExperiencia(String ex) {
        this.experiencia.add(ex);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nombre: ").append(persona)
                    .append("\n")
                    .append("Resumen: ").append(contenido)
                    .append("\n")
                    .append("Profesion: ").append(carrera)
                    .append("\n")
                    .append("Experiencia: \n");
        for (String ex: this.experiencia)
        {
            stringBuilder.append("- ").append(ex).append("\n");
        }
        return stringBuilder.toString();
    }
}
