package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q07_09 {
    public static double min(double[] array){
        double min_num = array[0];
        
        for (int i = 1; i < 10; i++) {
            if (array[i] < min_num){
                min_num = array[i];
            }
        }
        
        return min_num;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] user_array = new double[10];
        
        System.out.println("As-salamu alaykum!\nEnter 10 numbers to get the minimum..");
        for (int i = 0; i < 10; i++) {
            user_array[i] = input.nextDouble();
        }
        
        System.out.println("\nMin number is: " + min(user_array));
        
    } // main closing
}

/* Test cases: 
8 99 7 5 6 4 2 3 14 100
1 99 7 5 0 8 2 3 66666 3
-8 5 7 5 0 8 2 3 66666 3
*/
