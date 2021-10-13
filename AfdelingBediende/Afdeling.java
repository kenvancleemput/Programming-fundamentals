
/**
 * Write a description of class Afdeling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Afdeling
{
    private String naam;
    private String locatie;

    /**
     * Constructor for objects of class Afdeling
     */
    public Afdeling(String wnNaam, String wnLocatie)
    {
        naam = wnNaam;
        locatie = wnLocatie;
    }

    public String getNaam()
    {
        return naam;
    }
    
    public String getLocatie()
    {
        return locatie;
    }
    
    public void setLocatie(String wnLocatie)
    {
        locatie = wnLocatie;
    }
    
    public String toString()
    {
        return naam + " op de locatie " + locatie +".";
    }
}
