package sheet01_pl2_fall2024;

import java.util.Scanner;

public class Question02_02 {
    public static void answer(){
            Scanner input = new Scanner(System.in);

        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // Compute area and volume
        double area = radius * radius * 3.14159;
        double volume = area * length;

        // Display result
        System.out.println("The area is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
