package pl2_sheet_3;

/**
 *
 *
 * @author Ahmed Ayman
 */
import java.util.Scanner;

public class Q09_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Salamu Alaykum!\nWelcome to the Linear Equations!");
        System.out.println("\nEnter the coefficients");
        System.out.println("(a, b, c, d, e, f) respectively below..");

        double a, b, c, d, e, f;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        LinearEquation lin_eq = new LinearEquation(a, b, c, d, e, f);

        if (0 == (a * d - b * c)) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.printf("X = ((%.0f*%.0f)-(%.0f*%.0f))"
                    + "/((%.0f*%.0f)-(%.0f*%.0f)) \n= %.0f\n",
                     e, d, b, f, a, d, b, c,
                     lin_eq.getX());

            System.out.printf("Y = ((%.0f*%.0f)-(%.0f*%.0f))"
                    + "/((%.0f*%.0f)-(%.0f*%.0f)) \n= %.0f\n",
                     a, f, e, c, a, d, b, c,
                     lin_eq.getY());
        }
    }
}

class LinearEquation {

    // data fields
    private double a, b, c, d, e, f;

    // constructors
    public LinearEquation(double A, double B, double C, double D, double E, double F) {
        a = A;
        b = B;
        c = C;
        d = D;
        e = E;
        f = F;
    }

    // methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (0 != ((a * d) - (b * c)));
    }

    public double getX() {
        return ((e * d - b * f) / (a * d - b * c));
    }

    public double getY() {
        return ((a * f - e * c) / (a * d - b * c));
    }

    public double setA() {
        return a;
    }

    public double setB() {
        return b;
    }

    public double setC() {
        return c;
    }

    public double setD() {
        return d;
    }

    public double setE() {
        return e;
    }

    public double setF() {
        return f;
    }
}

/* Test Cases
9 4 3 -5 -6 -21
x is −2.0 and y is 3.0

1 2 2 4 4 5
The equation has no solution
 */
