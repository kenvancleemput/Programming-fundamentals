/**
 * Write a description of class Datum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Datum
{
    // instance variables - replace the example below with your own
    private int dag;
    private int maand;
    private int jaar;

    /**
     * Constructor for objects of class Datum
     */
    public Datum(int geefDag, int geefMaand, int geefJaar)
    { 
        if (geefDag > 0 && geefDag < 32) {
            dag = geefDag;
    } 
        if (geefMaand > 0 && geefMaand < 13) {
            maand = geefMaand;
        }
        jaar = geefJaar;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDag (int geefDag)
    { 
        if (geefDag > 0 && geefDag < 32) {
            dag = geefDag;
        } 
    }
    
    public void setMaand (int geefMaand) {
        if (geefMaand > 0 && geefMaand < 13) {
            maand = geefMaand;
        }
        
    }
    
    public void setJaar (int geefJaar) {
        jaar = geefJaar;
    }
    
    public String toString() {
        return dag + "-" + maand + "-" + jaar;
    }
}