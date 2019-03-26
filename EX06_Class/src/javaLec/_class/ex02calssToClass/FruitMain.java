package javaLec._class.ex02calssToClass;

public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		seller.saleApple(buyer, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
