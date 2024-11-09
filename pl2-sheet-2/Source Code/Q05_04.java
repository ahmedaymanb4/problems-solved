package Sheet02PL2;

// @author Bebooo

public class Q05_04 {
    public static void main(String[] args) {
        System.out.println("Miles to Kg: ");
        System.out.println("Miles\tKilometers");
        for(int km=1; km<=10; km++){
            System.out.println(km 
                    + "\t" 
                    + 1.609 * km);
        }
    }
}
