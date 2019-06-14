package hehangrui.Ex0001.kadai02;

import java.util.HashMap;
import java.util.Map;

/**
 * メインクラスから顧客の選んだ商品を入れるかごを作成する.
 * かごにある商品の合計金額を計算する.
 *
 * @author Adrian
 */

public class ShoppingCart {

	Map<Products, Integer> itemMap = new HashMap<>();

	/**
	 * 選択した商品を個数分かごに入れる
	 */
	public void putItemMap(Products products, Integer itemCount) {
		itemMap.put(products, itemCount);
	}

	/**
	 * かごに入っている商品を表示する
	 */
	public void displayItem() {
		for (Map.Entry<Products, Integer> entry : itemMap.entrySet()) {
			System.out.println("商品名: " + entry.getKey().getProductName() + "   価格: " + entry.getKey().getProductPrice()+ "円   個数: " + entry.getValue());
		}
	}

	/**
	 * 合計金額を計算する
	 */
	public void calcPrice() {
		int totalMoney = 0;
		for (Map.Entry<Products, Integer> entry : itemMap.entrySet()) {
			totalMoney += entry.getKey().getProductPrice() * entry.getValue();
		}
		System.out.println("合計金額: " + totalMoney + "円" + "\n");
	}
}
