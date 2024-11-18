package pl2_sheet_3;

/**
 * 
 * @author Ahmed Ayman
 */

import java.util.Date;

public class Q09_03 {
    public static void main(String[] args) {
        Date prog_date = new Date();
        
        long i=10000;
        String str_date;
        
        while(i <= 100000000000L) {
            prog_date.setTime(i);
            str_date = prog_date.toString();
            System.out.println("After " + i 
                    + " ms, it\'s \"" + str_date + "\"");
            i*=10;
        }
    }
}
