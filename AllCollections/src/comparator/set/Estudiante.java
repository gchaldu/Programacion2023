package comparator.set;

public class Estudiante implements Comparable{

    private String nombre;
    private Integer dni;

    public Estudiante(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this.nombre==null)
        {
            return 0;
        }
        return this.nombre.compareTo(((Estudiante)o).nombre);
    }
}
