package kanayama.Ex0001.kadai02;

import java.util.HashMap;
import java.util.Map;

public class Basket {
	Map<Product, Integer> productMap = new HashMap<>();
	Customer customer = new Customer();

	public void putBasket(Product product,int count){
		productMap.put(product,count);
	}
	/**
	 * 買い物かご内の商品を表示
	 *
	 */
	public void displayBasket(String customerName) {
		System.out.println("［" + customerName + "さんの買い物かご一覧］");
		for(Product product: productMap.keySet()) {
			System.out.printf("%-6s　",product.getProductName());
			System.out.printf("@\\%,4d　×",product.getProductPrice());
			System.out.println(productMap.get(product) + "個");
		}
	}
	/**
	 * 買い物かご内の商品の合計金額を表示
	 *
	 */
	public void displayTotalPrice() {
		int total = 0;
		for(Product basket: productMap.keySet()) {
			total += basket.getProductPrice() * productMap.get(basket);
		}
		System.out.printf("\n合計金額　　%,10d円\n",total);
		System.out.println("――――――――――――――――――");

	}
}
