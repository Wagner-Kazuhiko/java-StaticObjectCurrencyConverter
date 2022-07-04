package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double Dollar (double dollar) {
		return dollar;
	}
	
	public static double Quantity (double quantity) {
		return quantity;
	}
	
	public static double BuyDollar (double dollar, double quantity) {
		return (dollar * quantity) - (dollar * quantity * IOF);
	}
}
