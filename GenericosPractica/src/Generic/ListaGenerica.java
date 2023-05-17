package Generic;

public class ListaGenerica<T> {

    private T[] lista;
    private int count;
    private int dimension;

    public ListaGenerica(int dimension) {
        this.dimension = dimension;
        this.lista = (T[]) new Object[dimension];
        this.count=0;
    }
    public void add(T p)
    {
        this.lista[count]=p;
        this.count++;
    }

    public T get(int index)
    {
        try{
            return this.lista[index];
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return null; 
    }
    public T remove (int index)
    {
        T eliminada=null;
        try{
            eliminada = this.lista[index];
            for(int i=index; i < this.count; i++)
            {
                this.lista[i] = this.lista[i+1];
            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        this.count--;
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
