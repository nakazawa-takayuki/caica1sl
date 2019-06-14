package kanayama.Ex0001.kadai03;

/**
 * メインクラス
 * */
public class Call {
	public static void main(String srgs[]) {

		//商品
		Product productValueX = new Product("ニンジン",100);
		Product productValueY = new Product("トマト",200);
		Product productValueZ = new Product("ナス",150);

		//買い物かご
		Basket basketA = new Basket();
		Basket basketB = new Basket();

		//商品をかごに入れる
		Customer customerA = new Customer(basketA,"A");
		customerA.insertCustomerBasket(productValueX,1);
		customerA.insertCustomerBasket(productValueY,2);

		Customer customerB = new Customer(basketB,"B");
		customerB.insertCustomerBasket(productValueX,1);
		customerB.insertCustomerBasket(productValueY,2);
		customerB.insertCustomerBasket(productValueZ,3);

		customerA.callRemoveProduct(productValueX);
		customerB.callRemoveShopping();
		//表示
		customerA.outputBasketDispiay();
		customerB.outputBasketDispiay();
	}
}
