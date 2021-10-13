
/**
 * Write a description of class Persoon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private String naam;
    private Datum geboorteDatum;
    private int dag;
    private int maand;
    private int jaar;

    public Persoon()
    {
        naam = "Van Cleemput";
        geboorteDatum = new Datum(05,04,1980);
    }
    
    public Persoon(String geefNaam, Datum datum)
    {
        naam = geefNaam;
        geboorteDatum = datum;
    }
    
    public Persoon(String geefNaam)
    {
        naam = geefNaam;
        geboorteDatum = new Datum(01,01,2000);
    }
   
    public String getNaam()
    {
        return naam;
    }
        
    public void setNaam(String geefNaam)
    {
        naam = geefNaam;
    }
    
    public String toString()
    {
        return (naam + " is geboren op " + geboorteDatum.toString());
    }
    
    
}
