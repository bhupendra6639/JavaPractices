
import java.util.Scanner;

class Subtraction {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any two number for substraction");
        int number1 = s1.nextInt();
        int number2 = s1.nextInt();
        int difference = number1 - number2;
        System.out.println("Difference  is:" + difference);
    }
}
