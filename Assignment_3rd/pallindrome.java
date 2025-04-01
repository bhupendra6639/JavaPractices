
import java.util.Scanner;//take input

class Pallindrome {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter any number");
        int number = s1.nextInt();
        int rem, rev = 0;
        int temp = number;
        while (number > 0) {
            rem = number % 10;
            rev = rev * 10 + rem;//
            number = number / 10;
        }
        if (rev == temp) {
            System.out.println(temp + ":- number is Pallindrome");
        } else {
            System.out.println(temp + ":- number  is not Pallindroe");

        }

    }
}
