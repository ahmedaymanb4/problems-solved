package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q06_05 {
    
    /**
     *
     * @param num1
     * @param num2
     * @param num3
     */
    public static void displaySortedNumbers(
            double num1, double num2, double num3){
        // 1) initialize array[3] with = {num1, num2, num3};
        double[] nums = {num1, num2, num3};
        double temp;
        
        // 2) loop to sort the array, using Bubble Sort 
        for(byte j=0; j<nums.length ; j++){
            for(byte i=0; i<nums.length-1 ; i++){
                if (nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1]=temp;
                } else if(nums[i] < nums[i+1]){
                } else{}
            }
        }
        // 3) display array elements ascendingly
        for(byte i = 0; i<nums.length; i++)
            System.out.print(nums[i] + "\t");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.println("Welcome to three-numbers sorter!\n"
                + "Enter three numbers consecutively...");
        
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        
        displaySortedNumbers(n1, n2, n3);
    }
}


//        System.out.print("Test #1: ");
//        displaySortedNumbers(6, 8, 10);
//        System.out.print("Test #2: ");
//        displaySortedNumbers(8, 6, 10);
//        System.out.print("Test #3: ");
//        displaySortedNumbers(6, 10, 8);
//        
//        // This test didn't sort, it gives 8  6  10
//        System.out.print("Test #4: ");
//        displaySortedNumbers(8, 10, 6);
//        
//        System.out.print("Test #5: ");
//        displaySortedNumbers(10, 6, 8);
//        
//        // This test didn't sort, it gives 8  6  10
//        System.out.print("Test #6: ");
//        displaySortedNumbers(10, 8, 6);
