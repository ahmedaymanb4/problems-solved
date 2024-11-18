package pl2_sheet_3;

/**
 * Note that in get(GregorianCalendar.MONTH), months are 0-indexed.
 * (January = 0, February = 1, ..., November = 10)
 * You can check Java documentation at:
 * https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Calendar.html#MONTH
 * 
 * @author Ahmed Ayman
 */

import java.util.GregorianCalendar;

public class Q09_05 {

    public static void main(String[] args) {
        GregorianCalendar current = new GregorianCalendar();
        GregorianCalendar time_elapsed = new GregorianCalendar();

        // display current, full date
        System.out.print("Today's Date is: ");
        System.out.print(current.get(GregorianCalendar.YEAR) + "/");
        System.out.print((1 + current.get(GregorianCalendar.MONTH)) + "/"); // Months are 0-indexed
        System.out.println(current.get(GregorianCalendar.DAY_OF_MONTH));

        // set date to the milliseconds 1234567898765: long,
        // and then display the full date
        time_elapsed.setTimeInMillis(1234567898765L);

        System.out.print("Date since the time \"" + 1234567898765L + "\" elapsed is: ");
        System.out.print(time_elapsed.get(GregorianCalendar.YEAR) + "/");
        System.out.print((1 + time_elapsed.get(GregorianCalendar.MONTH)) + "/"); // Months are 0-indexed
        System.out.println(time_elapsed.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
