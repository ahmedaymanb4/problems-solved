package sheet01_pl2_fall2024;
// @author Bebooo

import java.util.concurrent.ThreadLocalRandom;


public class Question03_04 {
    public static void answer(){
        int number = 0;
        // init months array
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        number = ThreadLocalRandom.current().nextInt(1, 12);
        System.out.println("Month #" 
                + number
                + " is: "
                + months[number-1]);
    }
}
