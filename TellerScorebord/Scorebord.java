
/**
 * Write a description of class Scorebord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scorebord
{
    // instance variables - replace the example below with your own
    private Teller teller1;
    private Teller teller2;

    /**
     * Constructor for objects of class Scorebord
     */
    public Scorebord()
    {
        teller1 = new Teller();
        teller2 = new Teller();
    }

    public void verhoog1()
    {
        teller1.verhoog();
    }
    
    public void verhoog2()
    {
        teller2.verhoog();
    }
    
    public void verlaag1()
    {
        teller1.verlaag();
    }
    
    public void verlaag2()
    {
        teller2.verlaag();
    }
    
    public String toString()
    {
        return (teller1.getWaarde() + "-" + teller2.getWaarde());
    }
    
    public void print()
    {
        System.out.println("de score is " + teller1.getWaarde() + "-" + teller2.getWaarde() + ".");
    }
}