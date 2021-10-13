
/**
 * Write a description of class Boek here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boek
{
    // instance variables - replace the example below with your own
    private String titel;
    private String ISBN;
    private Persoon auteur;

    /**
     * Constructor for objects of class Boek
     */
    public Boek(String boekTitel, String boekISBN, String auteurNaam)
    {
        titel = boekTitel;// initialise instance variables
        ISBN = boekISBN;
        auteur = new Persoon(auteurNaam);
    }
    
    public Boek()
    {
        titel = "The Lord of the Rings";
        ISBN = "ISB5555";
        auteur = new Persoon("J.R.R. Tolkien");
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
        return ("titel: " + titel + ", ISBN: " + ISBN + ", geschreven door " + auteur.getNaam());
    }
}
