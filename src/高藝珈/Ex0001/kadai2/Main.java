package 高藝珈.Ex0001.kadai2;

/**
 * 【課題2】
 * 呼び出しクラス
 *
 * @author 高藝珈
 */

public class Main {

	public static void main(String[] args) {

		Goods goodsA = new Goods("いちご", 100);
		Goods goodsB = new Goods("メロン", 500);

		Basket basketA = new Basket();
		Basket basketB = new Basket();

		Customer customerA = new Customer("A", basketA);
		Customer customerB = new Customer("B", basketB);

		customerA.insertBasket(goodsA, 1);
		customerB.insertBasket(goodsA, 1);
		customerB.insertBasket(goodsB, 8);

		customerA.displayBasket(customerA.getCustomerName());
		customerB.displayBasket(customerB.getCustomerName());
	}

}
