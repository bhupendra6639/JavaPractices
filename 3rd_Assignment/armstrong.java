
import java.util.Scanner;

class Amstrong {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter any number");
        int number = s1.nextInt();git 
        int rem, sum = 0;
        int temp = number;
        while (number > 0) {
            rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println(temp + ":- number is armstrong");
        } else {
            System.out.println(temp + ":- number  is not armstrong");

        }

    }
}
