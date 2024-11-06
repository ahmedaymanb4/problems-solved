package sheet01_pl2_fall2024;
// @author Bebooo

import java.util.Scanner;

public class Question02_06 {

    public static void answer() {
        Scanner input = new Scanner(System.in);
        int number, digits_sum = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        while (number > 0 && number < 1000) {
            digits_sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits = " + digits_sum);
    }  // answer() closing
}
