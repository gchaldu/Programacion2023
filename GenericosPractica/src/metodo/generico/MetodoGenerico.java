package metodo.generico;

public class MetodoGenerico {

    public <T> Boolean buscarElemento(T[] arreglo, T elemento)
    {
        for(T item: arreglo)
        {
            if(item.equals(elemento))
            {
                return true;
            }
        }
        return false;
    }
}
