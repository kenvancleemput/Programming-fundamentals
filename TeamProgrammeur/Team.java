
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private Programmeur programmer1;
    private Programmeur programmer2;
    private Programmeur programmer3;
    private Programmeur programmer4;

    /**
     * Constructor for objects of class Team
     */
    public Team()
    {
        programmer1 = new Programmeur("Jef", "Java++");
        programmer2 = new Programmeur("Andy", "HTML");
        programmer3 = new Programmeur("Bryan", "COBOL");
        programmer4 = new Programmeur("Jules", "Unity");
        }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printAlleTeamleden()
    {
        System.out.println("Het team bestaat uit " + programmer1.print() + " en " + programmer2.print() + " en " + programmer3.print() + " en " + programmer4.print() + ".");
    }
}
