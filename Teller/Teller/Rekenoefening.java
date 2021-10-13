
/**
 * Write a description of class Rekenoefening here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rekenoefening
{
    // instance variables - replace the example below with your own
    private int getal1;
    private int getal2;
    private String bewerking;

    /**
     * Constructor for objects of class Rekenoefening
     */
    public Rekenoefening(int eersteGetal, int tweedeGetal)
    {
        getal1 = eersteGetal;
        getal2 = tweedeGetal;
        bewerking = "plus";
    }

    public int getGetal1()
    {
        return getal1;
    }

    public int getGetal2() {
        return getal2;
    }

    public String getBewerking() {
        return bewerking;
    }

    public void setGetal1(int getal) {
        getal1 = getal;
    }

    public void setGetal2(int getal) {
        getal2 = getal;
    }

    public void setBewerking(String uitTeVoerenBewerking) {
        if (uitTeVoerenBewerking == "plus" || uitTeVoerenBewerking == "min" || uitTeVoerenBewerking == "maal") {
            bewerking = uitTeVoerenBewerking;
        } else {
            System.out.println("Geef een geldige bewerking in.");
        }
    }

    public void getResult() 
    {
        if (bewerking.equals("plus")) {
            int resultaat = getal1 + getal2;
            System.out.println(getal1 + " samengeteld met " + getal2 + " = " + resultaat +".");
        } else {
            if (bewerking.equals("min")) {
                int resultaat = getal1 - getal2;
                System.out.println(getal2 + " afgetrokken van " + getal1 + "=" + resultaat +".");
            } else {
                if (bewerking.equals("maal")) {
                    int resultaat = getal1 * getal2;
                    System.out.println(getal1 + " vermenigvuldig met " + getal2 + "=" + resultaat + ".");
                }
            }
        }
    }
}
