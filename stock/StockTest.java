package stock;

public class StockTest {
	
	public static void main(String[] args) {
		
		Stock s1 = new Stock("ORCL","ORACLE CORPORATION");
		
		s1.previousClosingPrice = 34.5;
		
		s1.currentPrice = 34.35;
		
		System.out.println("Price change Percentage = "+s1.getChangePercent()+"%");

		
		
	}

}
