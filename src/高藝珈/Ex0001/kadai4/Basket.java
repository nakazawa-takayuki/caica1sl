package 高藝珈.Ex0001.kadai4;

import java.util.HashMap;
import java.util.Map;

/**
 * 【課題４】
 *
 * @author 高藝珈
 */

public class Basket {

	HashMap<Goods, Integer> mapItem = new HashMap<>();

	public void putBasket(Goods products, Integer itemNum) {
		mapItem.put(products, itemNum);
	}

	public void displayBasket(String customerName) {
		System.out.println(customerName + "様の買物一覧");
		for (Map.Entry<Goods, Integer> entry : mapItem.entrySet()) {
			System.out.println(entry.getKey().outputGoodsDetail(entry.getValue()));
		}
		displayTotal();
	}

	public void displayTotal() {
		int total = 0;
		for (Map.Entry<Goods, Integer> entry : mapItem.entrySet()) {
			total += entry.getKey().getPrice() * entry.getValue();
		}
		System.out.println("合計金額は：" + total + "円");
		System.out.println("-----------------------------------------");
	}

	public void emptyBasket(String customerName) {
		System.out.println(customerName + "様は買い物をやめる");
		mapItem.clear();
	}

	public void removePartGood(String customerName, Goods item) {
		System.out.println(customerName + "様は" + item.getItem() + "の購入をやめる");
		mapItem.remove(item);
	}
}
