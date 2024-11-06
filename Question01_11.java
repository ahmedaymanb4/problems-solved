package sheet01_pl2_fall2024;

/* Pseudo Code
init current_pop = 312032486;
init one_year_pop = (365*24*60*60/7.0) –(365*24*60*60/13.0) +(365*24*60*60/45.0) ; // births, deaths, and immigrants for one day
for 5 iterations {
    increase the population according to the year, given the yearly rate
}
*/

public class Question01_11 {
    public static void answer(){
        int secs_in_year= 365*24*60*60;
        double current_pop = 312032486, one_year_pop;
        one_year_pop = (secs_in_year/7.0) +(secs_in_year/45.0) - (secs_in_year/13.0);
        for(int i=1; i<=5; i++){
            current_pop = current_pop + one_year_pop;
            if(i==1){
                System.out.print("Population after " + i + " year: ");
                System.out.format("%.0f\n", current_pop);
            }
            else{
                System.out.print("Population after " + i + " year: ");
                System.out.format("%.0f\n", current_pop);
            }
        }
    }
}
