
/**
 * Write a description of class Mens here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mens
{
    // instance variables - replace the example below with your own
    private String naam;
    private int leeftijd;

    /**
     * Constructor for objects of class Mens
     */
    public Mens()
    {
        // initialise instance variables
        naam = "";
        leeftijd = 0;
    }

    public Mens(String naamAUB, int leeftijdAUB) {
        naam = naamAUB;
        if (leeftijdAUB > 0) {
            leeftijd = leeftijdAUB;
        } else {
            leeftijd = 0;
        }
    }

    public void setNaam(String voorAchterNaam) {
        naam = voorAchterNaam;
    }

    public void setLeeftijd(int age) {
        if (age >0) {
            leeftijd = age;
        } else {
            leeftijd = 0;
        }
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void spreek() {
        System.out.println("Dag, mijn naam is " + naam + " en ik ben " + leeftijd + "jaar.");
    }
}
