package 田畑陽一朗.Kadai3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 田畑 陽一朗
 *
 * Itemクラスの商品名と価格をmapにする。
 *「かごに入れる」「かごに入っている商品を表示する」「合計金額を計算する」3つの機能を持っている。
 *
 */

public class ShoppingCart {

	/**
	 * Itemクラスの商品名と価格をmapにする
	 */
	Map<Item, Integer> shoppingCartMap = new HashMap<>();

	/**
	 * 「かごに入れる」機能
	 * @param item
	 * @param itemCount
	 */
	public void putCart(Item item, Integer itemCount) {
		shoppingCartMap.put(item, itemCount);
	}

	/**
	 * 「かごに入っている商品を表示する」機能
	 */
	public void displayCart() {
		for (Map.Entry<Item, Integer> entry : shoppingCartMap.entrySet()) {
			Item getItem = entry.getKey();
			Integer itemCount = entry.getValue();
			System.out.println(getItem.getItemName() + getItem.getPrice() + "円  " + itemCount + "個");
		}
	}

	/**
	 * 「合計金額を計算する」機能
	 */
	public void calcTotalPrice() {
		int totalPrice = 0;
		for (Item item : shoppingCartMap.keySet()) {
			totalPrice += item.getPrice() * shoppingCartMap.get(item);
		}
		System.out.println("合計" + totalPrice + "円");
	}

	public void removeCartItem(Item item) {
		shoppingCartMap.remove(item);
	}

	public void clearCartItem() {
		shoppingCartMap.clear();
	}
}