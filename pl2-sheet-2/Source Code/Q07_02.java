package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q07_02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        
        System.out.println("As-salamu alaykum!\nWelcome to Reversed-order Displayer\n"
        + "Enter any 10 numbers and then view them reversed..");
        for (byte i = 0; i < 10; i++)
            nums[i] = in.nextInt();
        
        System.out.println("\nHere are the numbers reversed:");
        for(byte i = 9; i >= 0; i--)
            System.out.println(nums[i]);
    }
}
