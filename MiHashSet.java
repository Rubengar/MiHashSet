import java.util.Random;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private ArrayListInt set;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        set= new ArrayListInt();
    }
    /**
     * Añade el elemento al conjunto si no estaba. 
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    
    public boolean add(int valor)
    {
        boolean estaba = true;
        if (!set.contains(valor))
        {
            set.add(valor);
        }
        else
        {
            estaba = false;
        }
        return estaba;
    }
    /**
     * Vacía el conjunto
     */
    public void clear()
    {
        set.clear();
    }
    /**
     * Devuelve verdadero si el conjunto contiene el elemento, 
     * falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        if (set.contains(elemento))
        {
            contiene = true;
        }
        return contiene;
    }
    /**
     * Devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacio = false;
        if (set.isEmpty())
        {
            vacio = true;
        }
        return vacio;
    }
    /**
     *  Elimina del conjunto el elemento dado. 
     *  Si no existiera devuelve falso; 
     *  si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean existe = false;
        if (set.contains(elemento))
        {
           int index = set.indexOf(elemento);
           set.remove(index);
           existe = true;
        }
        return existe;
    }
    
}
