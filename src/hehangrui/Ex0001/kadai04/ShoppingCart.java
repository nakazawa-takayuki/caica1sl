package hehangrui.Ex0001.kadai04;

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
	 * @param itemMap
	 */
	public void putItemMap(Products products, Integer itemCount) {
		itemMap.put(products, itemCount);
	}

	/**
	 * かごに入っている商品を表示する
	 * @param itemMap
	 */
	public void displayItem() {
		if (itemMap.isEmpty()) {
			System.out.print("");
		} else {
			System.out.println("さんの買った物です。");
		}
		for (Map.Entry<Products, Integer> entry : itemMap.entrySet()) {
			if(entry.getValue() > 0) {
			System.out.println("商品名: " + entry.getKey().getProductName() + "   価格: " + entry.getKey().getProductPrice() + "円   個数: " + entry.getValue());
			}else{
				System.out.println("商品名: " + entry.getKey().getProductName() + "   価格: " + entry.getKey().getProductPrice() + "円   個数: " + "0");

			}
		}
	}

	/**
	 * 顧客が買い物をやめる処理
	 * @param itemMap
	 */
	public void disposalShopping() {
		itemMap.clear();
	}

	/**
	 * 顧客が一部の商品をやめる処理
	 * @param itemMap
	 */
	public void disposalItem(Products products) {
		itemMap.remove(products);
	}

	/**
	 * 合計金額を計算する
	 * @param itemMap
	 */
	public void calcPrice() {
		int totalMoney = 0;
		for (Map.Entry<Products, Integer> entry : itemMap.entrySet()) {
			if(entry.getValue() > 0) {
			totalMoney += entry.getKey().getProductPrice() * entry.getValue();
			}else {
				totalMoney += entry.getKey().getProductPrice() * 0;
			}
		}
		System.out.println("合計金額: " + totalMoney + "円" + "\n");
	}
}
