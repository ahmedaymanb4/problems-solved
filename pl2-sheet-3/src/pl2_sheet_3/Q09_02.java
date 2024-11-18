package pl2_sheet_3;
/**
 * 
 * <p>
 * This is the Java Code of both `Stock` implementation, 
 * and `Q09_02` has the `main()` for testing 
 * </p>
 * 
 * @author Ahmed Ayman
 */

public class Q09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        
        stock.previousClosingPrice = 34.5;
        System.out.println("Previous closing price is set to: " + stock.previousClosingPrice);
        
        stock.currentPrice = 34.35;
        System.out.println("Current price is set to: " + stock.currentPrice);
        
        System.out.printf("Price change (rounded to 0.0001)= %.4f%%\n"
                , stock.getChangePercent());
        
    }
}

class Stock{
    public String symbol, name;
    public double previousClosingPrice, currentPrice;
    
    public Stock(String specified_symbol, String specified_name){
        symbol = specified_symbol;
        name = specified_name;
    }
    
    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/100);
    }
}
