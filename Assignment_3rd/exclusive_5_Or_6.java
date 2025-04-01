
import java.util.Scanner;

class Exclusive_5_OR_6 {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter last number for series:-");
        int number = s1.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i == 5 || i == 6) {
                continue;

            } else {
                System.err.print(i + "\s");
            }
        }
    }
}
