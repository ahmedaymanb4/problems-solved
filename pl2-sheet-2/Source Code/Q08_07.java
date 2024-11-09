package Sheet02PL2;

/**
 *
 * @author Bebooo
 */
// import java.util.Scanner;

public class Q08_07 {

    public static void main(String[] args) {
        // Create an array to store points
        double[][] points = {{-1, 0, 3}
            , {-1, -1, -1}
            , {4, 1, 1}
            , {2, 0.5, 9}
            , {3.5, 2, -1}
            , {3, 1.5, 3}
            , {-1.5, 4, 2}
            , {5.5, 4, -0.5}};
        
        /*
        // to read array elements if it's not initialized
        for (int i = 0; i < points.length; i++) {
            System.out.print(printOrdinalNumbers(i+1) + " point coordinates: ");
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            points[i][2] = input.nextDouble();
        }
        */

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1, p3 = 2; // Initial three points 
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1], 
                points[p3][0], points[p3][1]); // Initialize shortestDistance

        // Compute distance for every two points 
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = i + 2; k < points.length; k++) {
                    double distance = distance(points[i][0], points[i][1],
                            points[j][0], points[j][1], 
                            points[k][2], points[k][2]); // Find distance 

                    if (shortestDistance > distance) {
                        p1 = i; // Update p1 
                        p2 = j; // Update p2 
                        shortestDistance = distance; // Update shortestDistance 
                    }                    
                }
            }
        }

        // Display result 
        System.out.println("The closest two points are "
                + "(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] 
                + ") and ("
                + points[p2][0] + ", " + points[p2][1]  + ", " + points[p2][2] + ")");
    }

    // Compute the distance between two points (x1, y1, z1) and (x2, y2, z2)
    public static double distance(
            double x1, double y1, double z1,
            double x2, double y2, double z2) {
        return Math.sqrt(Math.pow((x2 - x1), 2)
                + Math.pow((y2 - y1), 2)
                + Math.pow((z2 - z1), 2));
    }
  
    // Utility function to print numbers in ordinal (i.e 1st, 2nd, 23rd) form
    public static String printOrdinalNumbers(int number) {
        if(number ==0){
            return (0 + "th");
        }
        else if (number % 100 == 11 || number % 100 == 12 || number % 100 == 13) {
            return (number + "th");
        }
        else {
            if (1 == number % 10)
                return (number + "st");
            else if (2 == number % 10)
                return (number + "nd");
            else if (3 == number % 10)
                return (number + "rd");         
            else 
                return (number + "th");
        }
    }
}

/*
import java.util.Scanner;

public class FindNearestPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; // Initial two points 
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]); // Initialize shortestDistance

        // Compute distance for every two points 
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance 

                if (shortestDistance > distance) {
                    p1 = i; // Update p1 
                    p2 = j; // Update p2 
                    shortestDistance = distance; // Update shortestDistance 
                }
            }
        }

        // Display result 
        System.out.println("The closest two points are "
                + "(" + points[p1][0] + ", " + points[p1][1] + ") and ("
                + points[p2][0] + ", " + points[p2][1] + ")");
    }

    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}
*/
