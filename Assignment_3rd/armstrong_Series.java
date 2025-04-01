
import java.util.Scanner;

class Armstrong {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number for series :-");
        int number = s1.nextInt();
        System.out.println("ArmStrong number series are :-");
        for (int i = 11; i <= number; i++) {
            int rem, rev = 0;
            int num = i;
            int temp = num;
            while (num > 0) {
                rem = num % 10;
                rev = rev + (rem * rem * rem);
                num = num / 10;
                if (rev == temp) {
                    System.out.println(temp);
                }
            }
        }

    }
}
