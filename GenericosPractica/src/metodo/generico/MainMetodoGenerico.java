package metodo.generico;

public class MainMetodoGenerico {
    public static void main(String[] args) {
        MetodoGenerico metodoGenerico = new MetodoGenerico();
        Integer[] arreglo = {1,2,5,20,3};
        Boolean esta=metodoGenerico.buscarElemento(arreglo,30);
        System.out.println("esta = " + esta);

        String[] arregloStr = {"Pepe", "Maria", "Ana", "Sole"};
        esta=metodoGenerico.buscarElemento(arregloStr,"Ana");
        System.out.println("esta = " + esta);

    }
}
