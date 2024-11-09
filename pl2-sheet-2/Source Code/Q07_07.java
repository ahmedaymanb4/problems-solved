package Sheet02PL2;

// @author Bebooo

import java.util.Random;

public class Q07_07 {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        // 1) init a “frequency” array and num variable
        int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int num=0;

        // 2) loop from 1 to 100 to generate and assign values    
        for (int i = 0; i < 100; i++) {
            num = (random.nextInt(10) *3) %10; // *3 is for more randomness
            counts[num]++;
        }
        
        // 3) display the array
        System.out.println("Frequencies of the digits\n"
                + "0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(counts[i]+ "\t");
        }
        System.out.println();
    } // main closing
}
