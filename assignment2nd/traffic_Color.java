
import java.util.Scanner;
//input
class Month {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Any  Color For Traffic Singnal Info Check");
        String color = s1.nextLine();
        switch (color) { //expression 
            case "red":
                System.out.println(color + " Color For Stop");
                break;
            case "yellow":
                System.out.println(color + " Color for Get Ready");
                break;
            case "green":
                System.out.println(color + " Color for Go");
                break; //terminate loop
            default:
                System.err.println("Invalid Color");

        }
    }
}
