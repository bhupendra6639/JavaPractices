
import java.util.Scanner;

class Area_Of_CirCumferance {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius");
        float radius = s1.nextFloat();
        double Area = pi * (radius * radius);
        System.err.println(" Area of a Circumference of a Circle is :" + Area);
    }
}
