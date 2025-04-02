
import java.util.Scanner;

class EvenOddNo {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter any number");
        int number = s1.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + ":-This Number is Even:-");
        } else {
            System.out.println(number + ":-This Number is Odd:-");
        }
    }
}
