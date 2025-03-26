
import java.util.Scanner;

class Grade {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Student Marks:-");
        int marks = s1.nextInt();
        if (marks >= 90) {

            System.out.println("student pass in A Grade ");

        }
        if (marks >= 80 && marks <= 89) {

            System.out.println("student pass in b Grade ");

        }
        if (marks >= 70 && marks <= 79) {

            System.out.println("student pass in c Grade ");

        }
        if (marks >= 61 && marks <= 69) {

            System.out.println("student pass in D Grade ");

        } else if (marks <= 60) {
            System.out.println("student is Fail  ");
        }
    }
}
