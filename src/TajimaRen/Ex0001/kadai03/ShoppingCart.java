package TajimaRen.Ex0001.kadai03;

import java.util.HashMap;

/**
 * 【買い物かご】
 * 買い物かごに商品を入れ、まず商品の種類ごとの合計金額を算出する。
 * 商品の種類ごとの合計金額どうしを足して買い物かごの商品の総計を算出する。
 * 商品名、商品の個数、一種類の商品の合計金額、全商品の総計金額を表示する。
 *
 * @author TajimaRen
 */

public class ShoppingCart {
	HashMap<Products,Integer> cart = new HashMap<>();		//かごに入っている商品とその数
	double grandTotalPrice;								//かごに入っている全種類の商品の総計金額

	/**
	 * HashMapのキーに商品情報、値にかごに入れた商品(一種類)の数を入れる
	 * @param productsName
	 * @param productsCount
	 */
	public void putCart(Products products,Integer productsCount) {
		cart.put(products,productsCount);
	}

	/**
	 * かごに入っている商品の種類と種類ごとの合計額を表示
	 * 種類ごとの合計額を足していき総計額を算出する
	 */
	public void printDetailProducts() {
		for(HashMap.Entry<Products,Integer> entry : cart.entrySet()) {
			String cartProductsName;								//かごに入っている商品の名前
			Integer cartProductsCount;							//かごに入っている一種類の商品の個数
			double totalPrice;									//かごに入っている一種類の商品の合計金額
			cartProductsName = entry.getKey().getProductsName();
			cartProductsCount = entry.getValue();
			totalPrice = entry.getKey().calcCart(entry.getValue());

			System.out.println("商品名：" + cartProductsName + "　個数：" + cartProductsCount
					+ "　合計：" + totalPrice + "円" + "\n");
			grandTotalPrice += totalPrice;
		}
	}

	/**
	 * printDetailProductsで算出した、かごに入れた全商品の総計金額を表示する
	 */
	public void printTotalPrice() {
		System.out.println("総計金額：" + grandTotalPrice + "円" + "\n\n");
	}

	/**
	 * 買い物をやめる
	 * かごに入れた全ての商品を破棄する
	 */
	public void clearProducts() {
		cart.clear();
	}

	/**
	 * 商品をやめる
	 * かごに入れた一種類の商品を破棄する
	 * @param products
	 */
	public void removeShopping(Products products) {
		cart.remove(products);
	}
}
