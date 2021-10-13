
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
    private String omschrijving;
    private int aantal;
    private double prijs;

    public Product(String pOmschrijving, int pAantal, double pPrijs)
    {
        aantal = pAantal;
        omschrijving = pOmschrijving;
        prijs = pPrijs;
    }

    public void druk()
    {
        System.out.println(aantal + " " + omschrijving + " aan € " + prijs + " per stuk.");        
    }
    
    public void raisePriceby1()
    {
        prijs = prijs +1;
    }
    
    public void doublePrice()
    {
        prijs = prijs * 2;
    }
    
    public void halvePrice()
    {
        prijs = prijs / 2;
    }
    
    public void priceTenpercentup()
    {
        prijs = prijs + (prijs * 0.10);
    }
    
    public void priceTwentypercentdown()
    {
        prijs = prijs - (prijs * 0.20);
    }
    
}
