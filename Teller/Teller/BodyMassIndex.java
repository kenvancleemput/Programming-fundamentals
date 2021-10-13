
/**
 * Write a description of class BodyMassIndex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BodyMassIndex
{
    // instance variables - replace the example below with your own
    private int lengte;
    private double massa;
    
    public BodyMassIndex(int length, double mass)
    {
        lengte = length;// initialise instance variables
        massa = mass;
    }
    
    public BodyMassIndex ()
    {
        lengte = 170;
        massa = 70.5;
    }

    public void setLengte(int length)
    {
        lengte = length;
    }
    
    public void setMassa(double mass)
    {
        massa = mass;
    }
    
    public int getLengte()
    {
        return lengte;
    }
    
    public double getMassa()
    {
        return massa;
    }
    
    public double getBMI()
    {   
        double bmi;
        int lengtebmi;
        lengtebmi = lengte * lengte;
        bmi = massa / lengtebmi;
        return bmi;
    }
    
    public void printInfo()
    {
        double bmi;
        int lengtebmi;
        lengtebmi = lengte * lengte;
        bmi = massa / lengtebmi;
        System.out.println("Met een lengte van " + lengte + " en een gewicht van " + massa + " hebt u een BMI van " + bmi + "."); 
    }
}
