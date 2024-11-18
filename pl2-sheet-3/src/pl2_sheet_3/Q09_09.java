package pl2_sheet_3;

/**
 *
 * @author Ahmed Ayman
 */
public class Q09_09 {

    public static void main(String[] args) {
        // Polygon 1
        RegularPolygon poly1 = new RegularPolygon(6, 4);
        System.out.println("Polygon 1 Area: " + poly1.getArea());
        System.out.println("Polygon 1 Perimeter: " + poly1.getPerimeter());

        System.out.println(""); // newline seperator

        // Polygon 2
        RegularPolygon poly2 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygon 2 Area: " + poly2.getArea());
        System.out.println("Polygon 2 Perimeter: " + poly2.getPerimeter());
    }
}

class RegularPolygon {

    // Data Fields
    private int n = 3;
    private double side = 1.0, x = 0.0, y = 0.0;

    // Constructors 
    public RegularPolygon() {
    }

    public RegularPolygon(int number_of_sides, double side_length) {
        n = number_of_sides;
        side = side_length;
        x = 0.0;
        y = 0.0;
    }

    public RegularPolygon(int number_of_sides, double side_length, double x_point, double y_point) {
        n = number_of_sides;
        side = side_length;
        x = x_point;
        y = y_point;
    }

    // Methods
    public double getPerimeter() {
        return (n * side);
    }

    public double getArea() {
        return ((n * (side * side)) / (4 * Math.tan(Math.PI / n)));
    }

    // setters and getters
    public void setNumberOfSides(int N) {
        n = N;
    }

    public void setSidesNumber(double Side) {
        side = Side;
    }

    public void setX(double X) {
        x = X;
    }

    public void setY(double Y) {
        y = Y;
    }

    public int getNumberOfSides() {
        return n;
    }

    public double getSidesNumber() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
