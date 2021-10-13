
/**
 * Write a description of class Bediende here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bediende
{
    private String naam;
    private int salaris;
    private Afdeling afdeling;

    /**
     * Constructor for objects of class Bediende
     */
    public Bediende(String voorNaam, int beginSalaris)
    {
        naam = voorNaam;
        salaris = beginSalaris;
    }

    public void verhoogSalaris(int verhoging)
    {
        if(verhoging > 10)
        {
            salaris = salaris + (salaris*10/100);
            System.out.println("Maximale verhoging is 10%");
        } else {
            salaris = salaris + (salaris*verhoging/100);
            System.out.println("Verhoging gelukt");
        }
    }
    
    public void setAfdeling(String wnAfdeling, String wnLocatie)
    {
        afdeling = new Afdeling(wnAfdeling, wnLocatie);
    }
    
    public String toString()
    {
        return (naam + " verdient " + salaris + " en is werkzaam in " + afdeling.toString());
    }
}
