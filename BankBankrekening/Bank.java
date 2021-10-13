
/**
 * Write a description of class Bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bank
{
    private Bankrekening rekening1;
    private Bankrekening rekening2;
    private Bankrekening rekening3;

    
    public Bank()
    {
        rekening1 = new Bankrekening("555-55555-55",25.00);// initialise instance variables
        rekening2 = new Bankrekening("666-66666-66",30.00);
        rekening3 = new Bankrekening("777-77777-77",35.25);
    }

    public void printAlleRekeningen()
    {
        System.out.println("Rekening 1 heeft als rekeningnummer " + rekening1.rekNummer() + " en als saldo " + rekening1.rekSaldo() + ". Rekening 2 heeft als rekeningnummer " + rekening2.rekNummer() + " en als saldo " + rekening2.rekSaldo() + ". Rekening 3 heeft als rekeningnummer " + rekening3.rekNummer() + "en als saldo " + rekening3.rekSaldo() + ".");
    }
    
    public double getTotaalSaldo()
    {
        return (rekening1.rekSaldo()) + (rekening2.rekSaldo()) + (rekening3.rekSaldo());
    }
    
    public void printTotaalSaldo()
    {
        System.out.println("Het saldo op de gezamenlijke rekeningen bedraagt " + (rekening1.rekSaldo() + rekening2.rekSaldo() + rekening3.rekSaldo()) + ".");
    }
}
