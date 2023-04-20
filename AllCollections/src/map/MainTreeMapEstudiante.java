package map;

import comparator.set.Estudiante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainTreeMapEstudiante {

    public static void main(String[] args) {
        Map<Integer, Estudiante> map = new TreeMap<>();

        Estudiante estudiante = new Estudiante("Maria", 100);
        Estudiante estudiante2 = new Estudiante("Ana", 20);
        Estudiante estudiante3 = new Estudiante("Lucia", 30);

        /**alta estudiante*/
        System.out.println("==== PUT estudiantes ===");
        System.out.println();
        map.put(100, estudiante);
        map.put(101, estudiante2);
        map.put(102, estudiante3);
        System.out.println();
        /**listar estudiantes*/
        System.out.println("==== LISTAR estudiantes ===");
        System.out.println();
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        System.out.println();
        /**listar key de los registros de estudiantes*/
        System.out.println("==== LISTAR KEYS estudiantes ===");
        System.out.println();
        for(Integer key: map.keySet())
        {
            System.out.println("a.toString() = " + key);
        }
        System.out.println();
        System.out.println("==== GET estudiante Key 100 ===");
        System.out.println();
        System.out.println("Retornar un estudiante: " + map.get(100));
        System.out.println();
        /**modificar estudiante*/
        System.out.println("==== UPDATE estudiante Key 100 ===");
        System.out.println();
        map.replace(100, new Estudiante("Messi", 104));

        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        System.out.println();
        /**delete estudiante*/
        System.out.println("==== DELETE estudiante kEY 100 ===");
        System.out.println();
        map.remove(100);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        System.out.println();
        System.out.println("==== ADD estudiante 100 REPETIDO ===");
        System.out.println();
        map.put(100, estudiante);
        map.put(100, estudiante);
        map.put(100, estudiante);
        map.put(100, estudiante);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        System.out.println();
        System.out.println("==== PUT misma referencia distinta KEY ====");
        System.out.println();
        map.put(105, estudiante);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        System.out.println();
        /** Controlar la carga de key repetidas */
        System.out.println("==== PUT misma referencia distinta KEY ====");
        System.out.println();
        AddEstudiantes(map);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
    }

    public static boolean AddEstudiantes(Map<Integer, Estudiante> map)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dni");
        Integer dni = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre");
        String nombre = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, dni);

        for(Estudiante e: map.values())
        {
            if(e.getDni()==dni)
            {
                System.out.println("El dni esta duplicado...");
                return false;
            }
        }
        map.put(110, estudiante);
        return true;
    }

}
