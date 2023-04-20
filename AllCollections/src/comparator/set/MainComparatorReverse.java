package comparator.set;

import java.util.*;

public class MainComparatorReverse {
    public static void main(String[] args) {


        /*Set<Estudiante>  estudianteSet = new HashSet<>();

        Estudiante estudiante = new Estudiante("Zeus", 1);
        Estudiante estudiante2 = new Estudiante("Alberto", 8);
        Estudiante estudiante3 = new Estudiante("Messi", 3);

        estudianteSet.add(estudiante);
        estudianteSet.add(estudiante2);
        estudianteSet.add(estudiante3);
        estudianteSet.add(estudiante3);
        estudianteSet.add(estudiante3);

        estudianteSet.forEach(System.out::println);*/

        Set<Estudiante>  estudianteSet = new TreeSet<>();
        //Set<Estudiante>  estudianteSet = new TreeSet<>(Comparator.reverseOrder());

        Estudiante estudiante = new Estudiante("Zeus", 1);
        Estudiante estudiante2 = new Estudiante("Alberto", 8);
        Estudiante estudiante3 = new Estudiante("Messi", 3);
        Estudiante estudiante4 = new Estudiante("Messi", 30);

        estudianteSet.add(estudiante);
        estudianteSet.add(estudiante2);
        estudianteSet.add(estudiante3);
        estudianteSet.add(estudiante3);
        estudianteSet.add(estudiante4);

        estudianteSet.forEach(System.out::println);
        /*Obtener el maximo dni*/
        System.out.println();
        System.out.println("Max= " + Collections.max(estudianteSet));
        System.out.println("Min= " + Collections.min(estudianteSet));
    }
}
