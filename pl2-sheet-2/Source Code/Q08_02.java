package Sheet02PL2;

// @author Bebooo

import java.util.Scanner;

public class Q08_02 {
    public static double sumMajorDiagonal(double[][] m){
        double sum=0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final byte dimension_n = 4; 
        
        double[][] matrix = new double[dimension_n][dimension_n];
        
        System.out.println("As-salamu alaykum!\nWelcome to main diagonal summation");
        System.out.println("Enter your " + dimension_n + "ⅹ" + dimension_n
                + " array elements, of any numbers you choose...");
        
        for (int i=0; i < dimension_n; i++) {
            System.out.print("Row #" + (i+1));
            // for decent user interface
            System.out.print(" Elements #[" + ((i*dimension_n+dimension_n)
                    -(dimension_n-1))+"-"+(i*dimension_n+dimension_n)+"]: ");
            for (int j = 0; j < dimension_n; j++)
                matrix[i][j] = input.nextDouble();
        }
        
        System.out.println("Main Diagonal Sum = " + sumMajorDiagonal(matrix));
    } // main closing

}
