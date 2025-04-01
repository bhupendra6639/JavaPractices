
import java.util.Scanner;//take input

class Pallindrome {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number for series :-");
        int number = s1.nextInt();
        System.out.println("Pallindrome number series are :-");
        for (int i = 11; i <= number; i++) {
            int rem, rev = 0;
            int num = i;
            int temp = num;
            while (num > 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
                if (rev == temp) {
                    System.out.println(temp);
                }
            }
        }

    }
}
