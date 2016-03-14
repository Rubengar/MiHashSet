
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] lista;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        lista  = new int[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void add(int elemento)
    {
        int[] array2 = lista;
        lista = new int[array2.length + 1];
        for (int count = 0; count < array2.length; count++)
        {
            lista[count] = array2[count];
        }
        lista[array2.length] = elemento;
    }

    public void add(int index, int elemento)

    {
        if (index <= lista.length && index >= 0)
        {
            int[] local = lista;
            lista = new int[local.length + 1];
            for (int cont = 0; cont < local.length;cont++)
            {
                if (cont < index)
                {
                    lista[cont] = local[cont];
                }
                else
                {
                    lista[cont+1] = local[cont];
                }
            }
            lista[index] = elemento;
        }      
    }

    public void clear()
    {
        lista = new int[0];
    }

    public boolean contains(int elemento)
    {
        boolean encontrado = false;
        for(int a = 0; a< lista.length && encontrado == false; a++ )
        {
            if(elemento == lista[a])
            {
                encontrado= true;
            }        
        }
        return encontrado;
    }

    public int get(int index)
    {
        int numero = -1;
        if (index < lista.length && index >= 0)
        {
            numero = lista[index];
        }
        return numero;
    }

    public void set(int index, int element)
    {
        if((index < lista.length) && (index >= 0))
        {
            lista[index] = element;
        } 
    }

    public int indexOf(int elemento)
    {
        int numero = -1;
        int count = 0;
        while(count < lista.length && numero == -1)
        {
            if (lista[count]== elemento)
            {
                numero = count;
            }
            count++;
        }
        return numero;
    }

    public boolean isEmpty()
    {
        return lista.length == 0;
    }
    
    public int size()
    {
        return lista.length;
    }
    
    public int remove(int index)
    {
        int numero = -1;
        if (index >= 0 && index < lista.length)
        {
            int[] nuevo = lista;
            lista = new int[lista.length-1];
            for (int a = 0; a < index; a++)
            {
                lista[a] = nuevo[a];
            }
            for (int i = index ; i< lista.length; i++)
            {
                lista[i] = nuevo[i+1];
            }
            numero = nuevo[index];
        }
        return numero;
    }
}
