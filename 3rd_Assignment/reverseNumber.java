
import java.util.Scanner;

class ReverseNo {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter any number");
        int number = s1.nextInt();
        int rem, rev = 0;
        while (number > 0) {
            rem = number % 10;
            rev = rev * 10 + rem;//
            number = number / 10;
        }
        System.err.println("Reverse number is :- " + rev);
    }
}
