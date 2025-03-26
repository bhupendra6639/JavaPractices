
import java.util.Scanner;

class Operand {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Any Two Number ");
        double num1 = s1.nextDouble();
        double num2 = s1.nextDouble();
        double result;
        System.out.println("Enter the operand performed operation");
        char operand = s1.next().charAt(0);

        switch (operand) {
            case '+':
                result = num1 + num2;
                System.out.println("perform addition result is:-" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("perform addition result is:-" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("perform addition result is:-" + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = (num1 / num2);
                    System.out.println("perform addition result is:-" + result);
                    break;
                } else {
                    System.out.print("Divisible by Zero not allow :");
                    break;
                }

            default:
                System.err.println("Invalid Operand");

        }
    }

}
