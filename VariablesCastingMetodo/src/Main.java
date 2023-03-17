public class Main {
    public static void main(String[] args) {

        /** Casting primitivos */

        int numPrimitivo = 20;
        Integer numRef = 20;

        System.out.println("numPrimitivo = " + numPrimitivo);
        System.out.println("numRef = " + numRef.equals(numPrimitivo));

        /** Casting entre numeros de tipo de referencia */

        Double num = 30D;
        Integer numRef2 = num.intValue();

        Float numFloat = 25.3F;
        numRef = numFloat.intValue();

        numFloat = numRef.floatValue();

        num=numFloat.doubleValue();

        /**De String a numero*/

        String numStr = "20";
        String numStr2 = "40";
        Integer numInt = Integer.parseInt(numStr);
        Integer numInt2 = Integer.parseInt(numStr2);
        System.out.println(numInt + numInt2);

        Float nFloat = Float.parseFloat(numStr);

        /** De Numero a String*/

        Float n = 20.45f;
        String numStr3 = String.valueOf(n);

        /** Print SUMA*/

        System.out.println(numInt + numInt2 + "    Resultado = ");


        /** Propiedades de la clase */

        System.out.println("Rango de Max de un Int  " + Integer.MAX_VALUE);
        System.out.println("Rango de Min de un Int  " + Integer.MIN_VALUE);
        System.out.println("Bytes  " + Integer.BYTES);
        System.out.println("Size  " + Integer.SIZE);

        Integer maxNun =  2147483647;

        /**  Arreglos primeros pasos */
        String[] nombres = new String[10];
        nombres[0] = "ana";
        /*for(int i=0; i<nombres.length; i++)
        {
            System.out.println("nombres = " + nombres[i]);
        }
*/
        for ( String value: nombres)  {
            System.out.println("value = " + value);
        }

        Main m = new Main();
        m.MiPrimerFuncion("Hola Prog 3...");

        MiPrimerFuncion("hi prog 3", "Youtics");
    }

    public void MiPrimerFuncion(String m)
    {
        System.out.println(m);
    }
    public static void MiPrimerFuncion(String m, String ape)
    {
        System.out.println(m + " " + ape);
    }
}