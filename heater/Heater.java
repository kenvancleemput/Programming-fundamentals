
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double maxTemp, double minTemp)
    {
        temperature = 15.00;
        min = minTemp;
        max = maxTemp;
        increment = 5.00;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void warmer()
    {
        if (temperature <= max - increment) {
        temperature = temperature + increment;
    } else { 
        temperature = temperature + (max - temperature);
    }
}
    
    public void cooler()
    {
        if (temperature >= min + increment){
        temperature = temperature - increment;
        } else {
        temperature = temperature - (temperature - min);
        }
    }

    public void setIncrement(double setIncr) {
        if (setIncr < 0) {
            System.out.println ("Gebruik een positief getal"); 
            } else {
                increment = setIncr;
            }
        }
}
