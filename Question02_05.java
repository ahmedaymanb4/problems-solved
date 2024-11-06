package sheet01_pl2_fall2024;

import java.util.Scanner;
// @author Bebooo

public class Question02_05 {

    public static void answer() {
        Scanner input = new Scanner(System.in);
        float subtotal, gratuity_rate, total;
        System.out.print("Enter Subtotal & Gratuity Rate consecutively: ");
        subtotal = input.nextFloat();
        gratuity_rate = input.nextFloat();
        total = subtotal + gratuity_rate / 100.0f * subtotal;
        System.out.println("For the Gratuity Rate: " + gratuity_rate
                + ", Total is= " + total);
    }
}
