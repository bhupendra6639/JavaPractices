
import java.util.Scanner;

class largestno {

    public static void main(String args[]) {
        //scanner 
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 1s number");
        int number1 = s1.nextInt();
        System.out.println("Enter 2nd number");
        int number2 = s1.nextInt();
        System.out.println("Enter 3rd number");
        int number3 = s1.nextInt();
        if (number1 >= number2 && number1 >= number3) {

            System.out.print("number 1 is  greter or euqal to than no2 and no3:-" + number1);

        } else if (number2 >= number3 && number2 >= number1) {

            System.out.print("number 2 is  greter than or equal to no1 and no3:-" + number2);

        } else {
            
            System.out.print("number 3 is  greter than or Equal to no2 and no1:-" + number3);
        }
    }
}
