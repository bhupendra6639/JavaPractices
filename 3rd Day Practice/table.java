
import java.util.Scanner;

class Table {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number For Table");
        int number = s1.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.err.print((i * number) + "\s");
        }
    }

}
