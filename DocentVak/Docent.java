
/**
 * Write a description of class Docent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Docent
{
    private String naam;
    private String diploma;
    private final int MAXIMUM_AANTALVAKKEN = 1;
    private Vak vak;

    /**
     * Constructor for objects of class Docent
     */
    public Docent(String voorNaam, String behaaldDiploma)
    {
        naam = voorNaam;
        diploma = behaaldDiploma;
    }

    public boolean voegVakToe(String geefVak, int geefUren)
    {
        if (vak == null) {
            vak = new Vak (geefVak, geefUren);
            return true;
            }  
            return false;        
    }
    
    public String toString()
    {
        return (naam + " (diploma: " + diploma + ") geeft " + vak.toString());
    }
    
    public void verwijderVak()
    {
        vak = null;
    }
}
