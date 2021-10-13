
/**
 * Write a description of class Vak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vak
{
    private String vak;
    private int uren;

    public Vak(String geefVak, int aantalUur)
    {
        vak = geefVak;
        uren = aantalUur;
    }

    public String toString()
    { if (vak == null) {
        return " momenteel geen vak.";
    } else {
        return vak + " (uren: " + uren + ")."; 
    }
    }
}
