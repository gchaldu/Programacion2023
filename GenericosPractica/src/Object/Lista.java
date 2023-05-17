package Object;

public class Lista {

    private Object[] lista;
    private int count;
    private int dimension;

    public Lista(int dimension) {
        this.dimension = dimension;
        this.lista = new Object[dimension];
        this.count=0;
    }
     public void add(Object p)
     {
         this.lista[count]=p;
         this.count++;
     }

     public Object get(int index)
     {
         try{
             return this.lista[index];
         }catch (ArrayIndexOutOfBoundsException e)
         {
             System.out.println("e.getMessage() = " + e.getMessage());
         }
         return null;
     }
     public Object remove (int index)
     {
         Object eliminada=null;
         try{
             eliminada = this.lista[index];
             for(int i=index; i < this.count; i++)
             {
                 this.lista[i] = this.lista[i+1];
             }
             this.count--;
         }catch (ArrayIndexOutOfBoundsException error)
         {
             System.out.println("El indice" + index + "no existe" + error.getMessage());
         }
         return eliminada;
     }

     public void mostrar()
     {
         for(int i=0; i<this.count; i++)
         {
             System.out.println(this.lista[i]);
         }
     }
}
