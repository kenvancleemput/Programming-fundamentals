
/**
 * Write a description of class Bankrekening here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bankrekening
{
    // instance variables - replace the example below with your own
    private String rekeningnummer;
    private double saldo;

    /**
     * Create a new bank account
     */
    public Bankrekening(String rekNum, double newSaldo)
    {
        rekeningnummer = rekNum;
        saldo = newSaldo;
    }

    public void neemOp(double bedrag)
    {
        if (bedrag <= 0 ) {
            System.out.println("Geef een positief getal op");
        } else {
            saldo = saldo - bedrag;
        }
    }

    public void stort(double bedrag)
    {
        if (bedrag <= 0) {
            System.out.println("Geef een positief getal op");
        } else {
            saldo = saldo + bedrag;
        }
    }

    public void getSaldo() 
    {
        System.out.println("Uw rekeningstand bedraagt " + saldo + " euro.");
    }
    
    public void print()
    {
        System.out.println("Rekeningnummer: " + rekeningnummer + "heeft een saldo van " + saldo + " euro.");
    }
    
    public boolean isSaldoPositief()
    {
        
        if (saldo > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public String rekNummer()
    {
        return rekeningnummer;
    }
    
    public double rekSaldo()
    {
        return saldo;
    }
}

