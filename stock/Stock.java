package stock;

public class Stock {

	String symbol;
	
	String name;
	
	double previousClosingPrice;
	
	double currentPrice;
	
	Stock(String symbol, String name){
		
		this.symbol = symbol;
		
		this.name = name;
		
	}
	
	double getChangePercent(){
		
		double percent_change ;
		
		percent_change = (Math.abs(currentPrice - previousClosingPrice) / currentPrice) * 100;
		
		return percent_change;
		
	}
	
}
