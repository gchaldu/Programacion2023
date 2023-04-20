import java.util.Date;

public class Vuelo implements Comparable{

    private String nombre;
    private String origen;
    private String destino;
    private Date fecha;
    private Date hora;
    private Integer cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino,
                 Date fecha, Date hora, Integer cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }

    @Override
    public int compareTo(Object v) {
        /*if(this.getFecha()==null)
        {
            return 0;
        }
        return this.fecha.compareTo(((Vuelo)v).fecha);*/
        return 0;
    }
}
