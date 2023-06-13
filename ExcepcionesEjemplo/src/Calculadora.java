public class Calculadora {

    public double dividir (int denominador, int divisor) throws DivisionZeroException {
        if(divisor==0)
        {
            throw new DivisionZeroException("No se puede dividir por cero");
        }
        return denominador/divisor;
    }
}
