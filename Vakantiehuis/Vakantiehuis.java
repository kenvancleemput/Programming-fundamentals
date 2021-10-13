
/**
 * Write a description of class Vakantiehuis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vakantiehuis
{
    // instance variables - replace the example below with your own
    private double prijsperweek;
    private int week;
    private final int KORTINGSPERCENTAGE_2 = 15;
    private final int KORTINGSPERCENTAGE_3 = 20;
    private int maxpersonen;
    private int bezoekers;
    private double personenbelastingPerPersoonPerWeek;
    private boolean gereserveerd;
    private Persoon huurder;

    /**
     * Constructor for objects of class Vakantiehuis
     */
    public Vakantiehuis(int prijs, int maxAantal, double pb)
    {
        prijsperweek = prijs;
        maxpersonen = maxAantal;
        bezoekers = 0;
        personenbelastingPerPersoonPerWeek = pb;
        gereserveerd = false;
    }

    public boolean reserveer(int aantalBezoekers, int aantalWeken, Persoon huurder)
    {
        if( aantalBezoekers <= maxpersonen && aantalWeken > 0) {
            bezoekers = aantalBezoekers;
            week = aantalWeken;
            this.huurder = huurder;
            gereserveerd = true;
            return true;
        } else {
            gereserveerd = false;
            return false;
        }
    }

    public double getPrijs()
    {
        if (!gereserveerd) {
            return 0;
        } 
        double totalePrijs;
        totalePrijs = prijsperweek;//Prijs eerste week
        if(week > 1) {
            totalePrijs = totalePrijs + (prijsperweek*(100-KORTINGSPERCENTAGE_2)/100);
        } 
        if(week > 2) {
            totalePrijs = totalePrijs + ((prijsperweek*(100-KORTINGSPERCENTAGE_3)/100)*(week-2));
        }
        double totalePersonenBelasting;
        totalePersonenBelasting = personenbelastingPerPersoonPerWeek*bezoekers*week;
        totalePrijs = totalePrijs*1.01;
        return totalePrijs + totalePersonenBelasting;
    }
    
    public void print()
    {
        if (gereserveerd) {
            System.out.println("De totale prijs bedraagt " + getPrijs() + " en moet betaald worden door " + huurder.getNaam() + ".");
        }
    }
}
