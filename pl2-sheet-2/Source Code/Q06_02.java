package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q06_02 {
    public static int sumDigits(long n) {
            int sum = 0;
        
        while(n != 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to calculate its digits' sum");
        long user_num = input.nextLong();
        int result = sumDigits(user_num);
        System.out.println("Sum of " + user_num 
                + " digits = " + result);
    }
}
