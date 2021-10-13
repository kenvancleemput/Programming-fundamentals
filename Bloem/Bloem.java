

public class Bloem
{
    // instance variables - replace the example below with your own
    private String naam;
    private String kleur;
    private double stukPrijs;

    /**
     * Constructor for objects of class Bloem
     */
    public Bloem(String bloemNaam, String bloemKleur, double prijsPerStuk)
    {
        // initialise instance variables
        naam = bloemNaam;
        kleur = bloemKleur;
        stukPrijs = prijsPerStuk;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        System.out.println(naam + " heeft als kleur " + kleur + " en kost " + stukPrijs +".");
    }
    
    public void kleurGeel() {
        kleur = "geel";
    }
    
    public void setKleur(String nieuweKleur) {
        kleur = nieuweKleur;
    }
}
