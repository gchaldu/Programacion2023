package map;

import comparator.set.Estudiante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HasMapEstudiante {

    public static void main(String[] args) {
        Map<Integer, Estudiante> map = new HashMap<>();

        Estudiante estudiante = new Estudiante("Maria", 1);
        Estudiante estudiante2 = new Estudiante("Ana", 2);
        Estudiante estudiante3 = new Estudiante("Lucia", 3);

        /**alta estudiante*/
        System.out.println("==== PUT estudiantes ===");
        map.put(100, estudiante);
        map.put(101, estudiante2);
        map.put(102, estudiante3);

        /**listar estudiantes*/
        System.out.println("==== LISTAR estudiantes ===");
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }

        /**listar key de los registros de estudiantes*/
        System.out.println("==== LISTAR KEYS estudiantes ===");
        for(Integer key: map.keySet())
        {
            System.out.println("a.toString() = " + key);
        }

        System.out.println("==== GET estudiante Key 100 ===");
        System.out.println("Retornar un estudiante: " + map.get(100));

        /**modificar estudiante*/
        System.out.println("==== UPDATE estudiante Key 100 ===");
        map.replace(100, new Estudiante("Messi", 104));

        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }

        /**delete estudiante*/
        System.out.println("==== DELETE estudiante kEY 100 ===");
        map.remove(100);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }

        System.out.println("==== ADD estudiante 100 REPETIDO ===");
        map.put(100, estudiante);
        map.put(100, estudiante);
        map.put(100, estudiante);
        map.put(100, estudiante);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        System.out.println("==== PUT misma referencia distinta KEY ====");
        map.put(105, estudiante);
        for(Estudiante a: map.values())
        {
            System.out.println("a.toString() = " + a.toString());
        }
        /** Controlar la carga de key repetidas */
        System.out.println("==== PUT misma referencia distinta KEY ====");
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
