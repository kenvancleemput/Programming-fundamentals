
/**
 * Write a description of class Kast here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kast
{
    // instance variables - replace the example below with your own
    private int hoogte;
    private int breedte;
    private int diepte;

    
    public Kast(int height, int width, int depth)
    {
        hoogte = height;
        breedte = width;
        diepte = depth;
    }

    public int getHoogte()
    {
        return hoogte;
    }
    
    public int getBreedte()
    {
        return breedte;
    }
    
    public int getDiepte()
    {
        return diepte;
    }
    
    public void setHoogte(int height)
    {
        hoogte = height;
    }
    
    public void setBreedte(int width)
    {
        breedte = width;
    }
    
    public void setDiepte(int depth)
    {
        diepte = depth;
    }
    
    public void print()
    {
        System.out.println("De kast is:");
        System.out.println(hoogte + " hoog");
        System.out.println(breedte + " breed");
        System.out.println(diepte + " diep");
    }
    
    public int berekenVoorOppervlak()
    {
        return hoogte * breedte;
    }
    
    public int berekenenInhoud()
    {
        return hoogte * breedte * diepte;
    }
}
