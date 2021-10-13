
/**
 * Write a description of class Opdracht here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Opdracht
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Opdracht
     */
    public Opdracht()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void positiefNegatief(int getal)
    {
        if (getal > 0) {
            System.out.println("Getal is positief.");
        } else {
            if (getal < 0) {
                System.out.println("Getal is negatief.");
            } else { 
                System.out.println("Getal is 0.");
            }
        }
    }

    public void grootste(int getal1, int getal2, int getal3)
    {
        if (getal1 > getal2 && getal1 > getal3) {
            System.out.println(getal1);
        } else {
            if (getal2 > getal1 && getal2 > getal3) {
                System.out.println(getal2);
            } else {
                if (getal3 > getal1 && getal3 > getal2) {
                    System.out.println(getal3);
                } else {}
            }
        }
    }

    public void tussen10en20(int getal) {
        if (getal < 10) {
            System.out.println("Te klein.");
        } else {
            if (getal >= 10 && getal <= 20) {
                System.out.println("OK");
            } else {
                System.out.println("Te groot");
            }
        }
    }

    public void nietTussen5en27(int getal) {
        if (getal <= 5 || getal >= 27) {
            System.out.println("OK");
        } 
    }
    
    public void nietTussenMin2en13(int getal) {
        if (getal <= -2 || getal >= 13) {
            System.out.println("OK");
        }
    }
    
    public void verschilKleinerDan5(int getal1, int getal2) {
        if (getal1>getal2) {
            if(getal1-getal2 < 5) {
                System.out.println("OK");
            }
        } else {
            if (getal2-getal1 < 5) {
                System.out.println("OK");
            }
        }
    }
    
    public void testBooleantrue(boolean vlag) {
        if (vlag = true && vlag != false) {
            System.out.println("De vlag is true.");
        } 
    }
    
    public void testBooleanfalse(boolean vlag) {
        if (vlag != true) {
            System.out.println("De vlag is false.");
        } 
    }
}

