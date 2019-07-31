package hehangrui.Ex0001.kadai02;

/**
 * 商品の商品名と価格を定義する.
 * 顧客の名前と持ちかごを決める.
 * 処理クラスを呼び出し、出力する.
 *
 * @author Adrian
 */

public class Main {

	public static void main(String[] args) {

		// Product01をインスタンス化する
		Products item1 = new Products();
		Products item2 = new Products();
		Products item3 = new Products();
		Products item4 = new Products();

		ShoppingCart shoppingCart1 = new ShoppingCart();
		ShoppingCart shoppingCart2 = new ShoppingCart();
		ShoppingCart shoppingCart3 = new ShoppingCart();

		Customer people1 = new Customer();
		Customer people2 = new Customer();
		Customer people3 = new Customer();

		// 商品名と価格を設定する
		item1.setProductName("林檎");
		item1.setProductPrice(1000);

		item2.setProductName("梨");
		item2.setProductPrice(500);

		item3.setProductName("パイン");
		item3.setProductPrice(600);

		item4.setProductName("スイカ");
		item4.setProductPrice(2000);

		people1.setShoppingCart(shoppingCart1);
		people1.setCustomerName("佐藤");
		people1.getShoppingCart().putItemMap(item2, 1);

		people2.setShoppingCart(shoppingCart2);
		people2.setCustomerName("鈴木");
		people2.getShoppingCart().putItemMap(item3, 2);
		people2.getShoppingCart().putItemMap(item1, 4);
		people2.getShoppingCart().putItemMap(item4, 3);

		people3.setShoppingCart(shoppingCart3);
		people3.setCustomerName("高橋");
		people3.getShoppingCart().putItemMap(item4, 3);
		people3.getShoppingCart().putItemMap(item1, 5);

		// 出力する
		people1.printCustomerName();
		shoppingCart1.displayItem();
		shoppingCart1.calcPrice();

		people2.printCustomerName();
		shoppingCart2.displayItem();
		shoppingCart2.calcPrice();

		people3.printCustomerName();
		shoppingCart3.displayItem();
		shoppingCart3.calcPrice();
	}

}
