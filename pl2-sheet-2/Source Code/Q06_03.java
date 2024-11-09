package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q06_03 {
    public static int reverse(int number) {
        int reverse = 0;
        
        while(number!=0){
            reverse *= 10;
            reverse += number%10;
            number /= 10;
        }
        
        return reverse;
    }
    
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse: ");
        int n = input.nextInt();
        int rev_num = reverse(n);
        System.out.println("Reverse is: " + rev_num + ". ");
        if(isPalindrome(n))
            System.out.println(n + " is palindrome");
        else
            System.out.println(n + " is not palindrome");
    }
}
