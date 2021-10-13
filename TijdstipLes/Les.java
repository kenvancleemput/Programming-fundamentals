
/**
 * Write a description of class Les here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Les
{
    private String vak;
    private Tijdstip tijdstip;
    private String lokaal;

    /**
     * Constructor for objects of class Les
     */
    public Les()
    {
        vak = "Java";
        tijdstip = new Tijdstip("maandag",3);
        lokaal = "D021";        
    }

    public String getVak()
    {
        return vak;
    }
    
    public String getTijdStip()
    {
       return tijdstip.toString();
    }
    
    public String getLokaal()
    {
        return lokaal;
    }
    
    public void setVak(String welkVak)
    {
        vak = welkVak;
    }
    
    public void setTijdstip(String weekDag, int lesUur)
    {
        tijdstip.setDag(weekDag);
        tijdstip.setUur(lesUur);
    }
    
    public void setLokaal(String welkLokaal)
    {
        lokaal = welkLokaal;
    }
    
    public String toString()
    {
        return getTijdStip() + "e uur " + vak + " in lokaal " + lokaal + ".";
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
    
}
