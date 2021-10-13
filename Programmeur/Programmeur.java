

public class Programmeur
{
    // instance variables - replace the example below with your own
    private String naam;
    private String specialiteit;

    /**
     * Constructor for objects of class Programmeur
     */
    public Programmeur(String fullName, String specialty)
    {
        naam = fullName;// initialise instance variables
        specialiteit = specialty;
    }

    public void print() {
        System.out.println(naam + specialiteit);
    }
}