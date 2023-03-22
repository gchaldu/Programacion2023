import net.youtics.modelo.Persona;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        String nombre = in.nextLine();

        System.out.println("Ingrese su edad...");
        Integer edad = in.nextInt();

        Double salario = in.nextDouble();
        Character letra = in.next().charAt(0);

        System.out.println("Nombre: " + nombre + " Edad: " + edad);*/

        /*String numStr = JOptionPane.showInputDialog(null,"Ingrese un numero...");
        Integer numero = Integer.parseInt(numStr);
        System.out.println("numero = " + numero);
        JOptionPane.showMessageDialog(null, "El numero ingresado es: " + numero);*/
        JFrame ventana = new JFrame();
        ventana.setSize(400, 400);
        ventana.setTitle("Titulo");
        ventana.setVisible(true);
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Se pide una confirmación antes de finalizar el programa
                int option = JOptionPane.showConfirmDialog(
                        ventana,
                        "¿Estás seguro de que quieres cerrar la aplicación?",
                        "Confirmación de cierre",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });



        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre...");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su Apellido...");
        String dni = JOptionPane.showInputDialog(null, "Ingrese su DNI...");

        Integer dniInt = Integer.parseInt(dni);
        Persona ana = new Persona(nombre, apellido, dniInt);
        JOptionPane.showMessageDialog(null, ana.toString());

        /** Modificadores de acceso */

        ana.apellido = "Garcia";
        
    }
}