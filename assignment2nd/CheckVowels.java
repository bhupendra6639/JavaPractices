
import java.util.Scanner;

class Vowels {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = s1.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

    }
}
