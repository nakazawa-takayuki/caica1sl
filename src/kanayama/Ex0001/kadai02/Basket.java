package kanayama.Ex0001.kadai02;

import java.util.HashMap;
import java.util.Map;


public class Basket {

	Map<Product, Integer> productMap = new HashMap<>();
	Customer customer = new Customer();

	/**
	 * 買い物かごに商品名、価格を格納
	 */
	public void putBasket(Product product,int count){
		productMap.put(product,count);
	}

	/**
	 * 買い物かご内の商品を表示
	 */
	public void displayBasket(String customerName) {
		System.out.println("［" + customerName + "さんの買い物かご一覧］");
		for(java.util.Map.Entry<Product, Integer> entry: productMap.entrySet()) {
			System.out.print(entry.getKey().getProductName() + "単価：" + entry.getKey().getProductPrice());
			System.out.println("　×" + entry.getValue() + "個");
		}
	}

	/**
	 * 買い物かご内の商品の合計金額を表示
	 */
	public void displayTotalPrice() {
		double total = 0;
		for(java.util.Map.Entry<Product, Integer> entry: productMap.entrySet()) {
			total += entry.getKey().getProductPrice() * entry.getValue();
		}
		System.out.println("　　合計金額　　" + total + "円");
		System.out.println("――――――――――――――――――");

	}
}
