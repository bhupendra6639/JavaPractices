
import java.util.Scanner;

class PrimeNo {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number");
        int number = s1.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;

            }
        }
        if (flag == true) {
            System.out.println(number + " :- This Number is  prime");
        } else {
            System.out.println(number + " :- This Number is not prime");

        }
    }
}
