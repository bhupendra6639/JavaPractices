
/*It is a unit of temperature commonly used in the United States and
  some other countries. The Fahrenheit scale sets the freezing point of 
  water at 32°F and the boiling point at 212°F, with 180 equal divisions
   between the two.
   formula C= (F−32)×5/9
​*/
import java.util.Scanner;

class Temperature {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter fahreheit to convert celciuse");
        float fahreheit = s1.nextFloat();
        float celciuse = (fahreheit - 32) * 5 / 9;
        System.out.println(" fahreheit to convert celciuse temperature is: " + celciuse);
    }
}
