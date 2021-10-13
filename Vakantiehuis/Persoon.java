
/**
 * Write a description of class Persoon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persoon
{
    private String voorNaam;
    private String achterNaam;

    /**
     * Constructor for objects of class Persoon
     */
    public Persoon(String hvoorNaam, String hachterNaam)
    {
        voorNaam = hvoorNaam;
        achterNaam = hachterNaam;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getVoorNaam()
    {
        // put your code here
        return voorNaam;
    }
    
    public String getAchterNaam()
    {
        return achterNaam;
    }
    
    public String getNaam()
    {
        return voorNaam + " " + achterNaam;
    }
}
