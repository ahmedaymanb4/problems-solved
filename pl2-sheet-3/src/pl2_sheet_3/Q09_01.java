package pl2_sheet_3;

/**
 *
 * @author Ahmed Ayman
 */

/** UML
-------------------------
Rectangle
-------------------------
width: double
height: double
-------------------------
Rectangle()
getArea(): double
getPerimeter(): double
-------------------------
*/
public class Q09_01 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4,40);
        System.out.println("Width = " + rec1.width + "\tHeight = " + rec1.height);
        System.out.print("Area = " + rec1.getArea());
        System.out.println("\tPerimeter = " + rec1.getPerimeter());
        
        Rectangle rec2 = new Rectangle(3.5,35.9);
        System.out.println("Width = " + rec2.width + "\t Height = " + rec2.height);
        System.out.print("Area = " + rec2.getArea());
        System.out.println("\tPerimeter = " + rec2.getPerimeter());
        
    }
}

class Rectangle {
    // data fields
    double width, height;
    
    // constructors
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getters
    public double getArea(){
        return (width * height);
    }

    public double getPerimeter(){
        return (2*(width + height));
    }
}
