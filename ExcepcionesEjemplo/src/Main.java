import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Integer numerador = 10;
        Integer divisor = 0;
        double resultado;
        try{
            //resultado = denominador / divisor;
            //System.out.println("resultado = " + resultado);
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese el numero 1");
            numerador = scanner.nextInt();
            System.out.println("ingrese el numero 2");
            divisor = scanner.nextInt();
            Calculadora calculadora = new Calculadora();
            resultado = calculadora.dividir(numerador, divisor);
            System.out.println(resultado);
        }catch (DivisionZeroException ae) {
            System.out.println("Error " + ae.getMessage());
            System.out.println("ae.getStackTrace() = " + ae.getStackTrace().toString());
        }catch (InputMismatchException ea) {
            System.out.println(ea.getMessage());
        }finally {
            System.out.println("cerrar base de datos");
        }

        System.out.println("Sigue la normal ejecucion de mi codigo");
    }
}