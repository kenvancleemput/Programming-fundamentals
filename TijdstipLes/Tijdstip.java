
/**
 * Write a description of class Tijdstip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tijdstip
{
    private String dag;
    private int uur;

    public Tijdstip()
    {
        dag = "maandag";
        uur = 1;
    }
    
    public Tijdstip(String weekDag, int lesUur)
    {
        dag = weekDag;
        uur = lesUur;
    }

    public String getDag()
    {
        return dag;
    }
    
    public int getUur()
    {
        return uur;
    }
    
    public void setDag(String weekDag)
    {
        dag = weekDag;
    }
    
    public void setUur(int lesUur)
    {
        uur = lesUur;
    }
    
    public String toString()
    {
        return dag + " " + uur;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
}
