package prob3;

public class CurrencyConverter {
	
	private static double rate;	

	public static double getRate() {	
		
		return rate;
	}

	public static void setRate(double rate) {
		
		CurrencyConverter.rate = rate;
	}

	public static double toDollar(double a) {
		return (a / getRate());
	}
	
	public static double toKRW(double b) {
		return (b * getRate());
	}
}