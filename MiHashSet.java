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
     * añade el elemento al conjunto si no estaba. 
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
    
}
