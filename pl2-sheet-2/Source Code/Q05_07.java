package Sheet02PL2;

import java.util.Scanner;

// @author Bebooo
public class Q05_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float year_tuition, t_cost_after_tenth = 0.0f;

        System.out.print("Enter current tuition: ");
        year_tuition = input.nextFloat();

        for (int i = 1; i <= 14; i++) {
            year_tuition = year_tuition * 1.05f;
            if (i <= 10) {
                System.out.printf("Tution after %d year: %.0f\n",
                         i, year_tuition);
            } else {
                t_cost_after_tenth = t_cost_after_tenth + year_tuition;
            }
        } // for() closing
        
        System.out.println(".........\nAfter the tenth year, "
                + "Total tuition cost of four years = "
                + t_cost_after_tenth);
    }
}

/*
1. Declare variables year_tuition, t_cost_after_tenth=0;
2. Read year_tuition;
3. For 14 iterations: 
    a. current year's tuition = last year's tuition + 5%;
    b. If iteration <= 10: // the first 10 years
        i. displays the number of this-iteration year, year_tuition;
    c. else: // the 4 years after the first 10 years
        i. current total cost = current total + current year's tuition 
           (after applying the 5% increase);
4. Displays “Total tuition cost of four years, after the tenth year”;

*/
