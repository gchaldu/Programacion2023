package ejemplo3;

public class mainEjemplo3 {
    public static void main(String[] args) {
        int numerador=10;
        int divisor=0;
        double resultado;

        /*try
        {
            resultado = numerador/divisor;
            System.out.println("resultado = " + resultado);
        }catch (ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }finally {
            System.out.println("siempre se ejecuta...");
        }
        System.out.println("Continua con la ejecucion normal del programa");*/




        Calculadora calculadora = new Calculadora();
        try {
            resultado = calculadora.dividir(numerador, divisor);
            System.out.println(resultado);
        } catch (DividirPorZeroException e) {
            System.out.println(e.getMessage());;
        }
    }
}
