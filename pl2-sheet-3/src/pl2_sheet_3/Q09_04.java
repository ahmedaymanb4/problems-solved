package pl2_sheet_3;

/**
 * 
 * @author Ahmed Ayman
 */
import java.util.Random;

public class Q09_04 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        
    for (int i = 0; i < 50; i++) 
      System.out.print(rand.nextInt(100) + ", ");
    }
}
