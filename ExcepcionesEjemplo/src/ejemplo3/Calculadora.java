package ejemplo3;

public class Calculadora {

    public double dividir (int numerador, int divisor) throws DividirPorZeroException {
        if(divisor==0)
        {
            throw new DividirPorZeroException("No se puede dividir por cero");
        }

        return numerador/(double)divisor;
    }
}