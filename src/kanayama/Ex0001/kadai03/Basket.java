package kanayama.Ex0001.kadai03;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 顧客の名前、買い物かごを設定、取得するクラス
 * */
public class Basket {

	Map<Product, Integer> productMap = new HashMap<>();
	Customer customer = new Customer();

	/**
	 * 買い物かごに商品名、価格を追加する。
	 */
	public void putBasket(Product product,int count){
		if(count < 0) {
			count = 0;
			System.out.println("個数がマイナス値なので0に設定します。");
		}
		productMap.put(product,count);
	}

	/**
	 * 買い物かご内の商品を表示する。
	 * 合計金額表示メソッド displayTotalPriceに遷移する。
	 */
	public void displayBasket(String customerName) {
		System.out.println("［" + customerName + "さんの買い物かご一覧］");
		for(Map.Entry<Product, Integer> entry: productMap.entrySet()) {
			Product product = entry.getKey();
			System.out.println(product.outputDetailProduct(entry.getValue()));
		}
		displayTotalPrice();
	}

	/**
	 * 買い物かご内の商品の合計金額を算出し、表示する。
	 */
	public void displayTotalPrice() {
		if(productMap.isEmpty()) {
			System.out.println("何も入っていません");
		}else{
		double total = 0;

		for(Map.Entry<Product, Integer> entry: productMap.entrySet()) {
			BigDecimal productPriceDecimal = new BigDecimal(entry.getKey().getProductPrice());
			BigDecimal getValueDecimal = new BigDecimal(entry.getValue());
			total += productPriceDecimal.multiply(getValueDecimal).doubleValue();
		}
		String totalMessage = String.format("%,.0f",total);
		System.out.println("合計金額：" + totalMessage + "円");

		System.out.println("――――――――――――――――――");
		}
	}

	/**
	 * 買い物をやめる
	 */
	public void removeShopping() {
		productMap.clear();

	}
	/**
	 * 商品をやめる
	 */
	public void removeProduct(Product product) {
		productMap.remove(product);
	}
}
