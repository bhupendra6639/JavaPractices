
import java.util.Scanner;

class Number {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter any number");
        int number = s1.nextInt();
        if (number > 0) {
            System.out.print("number is postive");

        } else if (number < 0) {
            System.out.println("number is negative");

        } else {
            System.out.println("number is nor positive or Negative");
        }
    }
}
