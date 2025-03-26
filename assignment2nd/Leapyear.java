
import java.util.Scanner;

class LeapYear {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = s1.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {

            System.out.println(year + " Is leap Year");

        } else {

            System.out.println(year + " Is Not leap");

        }
    }
}
