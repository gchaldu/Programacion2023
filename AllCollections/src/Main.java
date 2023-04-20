import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Vuelo> vueloList = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();

        /* Fecha */
        calendar.set(2021,Calendar.AUGUST,21, 18, 20);
        Date fecha = calendar.getTime();
        /*SimpleDateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String fechaTexto = fechaFormat.format(fecha);
        fecha = fechaFormat.parse(fechaTexto);*/
        //System.out.println(fecha);

        /* Hora */
        Date hora = calendar.getTime();
        /*SimpleDateFormat horaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String horaTexto = horaFormat.format(hora);
        hora = horaFormat.parse(horaTexto);*/
        //System.out.println(hora);

        Vuelo vuelo = new Vuelo("AAL 933", "New York","Santiago", fecha, hora,62);

        /* Fecha */
        calendar.set(2021,Calendar.JANUARY,29, 10, 20);
        fecha = calendar.getTime();
        /*fechaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        fechaTexto = fechaFormat.format(fecha);
        fecha = fechaFormat.parse(fechaTexto);*/
        //System.out.println(fecha);

        /* Hora */
        hora = calendar.getTime();
        /*horaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        horaTexto = horaFormat.format(hora);
        hora = horaFormat.parse(horaTexto);*/
        //System.out.println(hora);

        Vuelo vuelo2 = new Vuelo("LAT 755", "Sao Paulo","Santiago", fecha, hora,102);

        /* Fecha */
        calendar.set(2021,Calendar.DECEMBER,15, 8, 5);
        fecha = calendar.getTime();
       /* fechaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        fechaTexto = fechaFormat.format(fecha);
        fecha = fechaFormat.parse(fechaTexto);*/
        //System.out.println(fecha);

        /* Hora */
        hora = calendar.getTime();
       /* horaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        horaTexto = horaFormat.format(hora);
        hora = horaFormat.parse(horaTexto);*/
        //System.out.println(hora);

        Vuelo vuelo3 = new Vuelo("LAT 755", "Buenos Aires","Santiago", fecha, hora,45);

        vueloList.add(vuelo);
        vueloList.add(vuelo2);
        vueloList.add(vuelo3);

        /*for (Vuelo v: vueloList)
        {
            System.out.println("v.toString() = " + v.toString());
        }*/
        //Collections.sort(vueloList);
        Collections.sort(vueloList, (a, b) -> a.getFecha().compareTo(b.getFecha()));
        vueloList.forEach(System.out::println);
        
        Vuelo ultimoVuelo = vueloList.get(vueloList.size()-1);
        System.out.println("ultimoVuelo.toString() = " + ultimoVuelo.toString());

        Collections.sort(vueloList, (a, b)-> a.getCantidadPasajeros().compareTo(b.getCantidadPasajeros()));
        vueloList.forEach(System.out::println);
        Vuelo mayorPasajeros = vueloList.get(vueloList.size()-1);
        System.out.println("mayorPasajeros.toString() = " + mayorPasajeros.toString());

    }
}