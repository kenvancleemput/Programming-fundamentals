
/**
 * Write a description of class Kind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kind
{
    // instance variables - replace the example below with your own
    private String naam;
    public Datum geboortedatum;
    public Datum inschrijvingsdatum;

    /**
     * Constructor for objects of class Kind
     */
    public Kind(String geefNaam, Datum gebDatum, Datum inschDatum)
    {
        naam = geefNaam;// initialise instance variables
        geboortedatum = gebDatum;
        inschrijvingsdatum = inschDatum;
    }
    
    public Kind()
    {
        naam = "Jef";
        geboortedatum = new Datum(1,1,2000);
        inschrijvingsdatum = new Datum (13,9,2021);
    }
    
    public void setNaam(String geefNaam)
    {
        naam = geefNaam;
    }
    
    public void setGebDatum(int geefDag, int geefMaand, int geefJaar)
    {
        geboortedatum.setDag(geefDag);
        geboortedatum.setMaand(geefMaand);
        geboortedatum.setJaar(geefJaar);        
    }
    
    public void setInschDatum(int geefDag, int geefMaand, int geefJaar)
    {
        inschrijvingsdatum.setDag(geefDag);
        inschrijvingsdatum.setMaand(geefMaand);
        inschrijvingsdatum.setJaar(geefJaar);        
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public String getGebDatum()
    {
        return geboortedatum.toString();
    }
    
    public String getInschDatum()
    {
        return inschrijvingsdatum.toString();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        // put your code here
        return (naam + ", geboren: " + geboortedatum + ", ingeschreven: " + inschrijvingsdatum + ".");
    }
}
