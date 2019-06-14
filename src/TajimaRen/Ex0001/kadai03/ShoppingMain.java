package TajimaRen.Ex0001.kadai03;

/**
 * メインクラス
 *
 * @author TajimaRen
 */

public class ShoppingMain {

	public static void main(String[] args) {

		/**
		 * 買い物かご
		 */
		ShoppingCart cart1 = new ShoppingCart();
		ShoppingCart cart2 = new ShoppingCart();

		/**
		 * 商品名と商品価格
		 */
		Products products1 = new Products("にんじん",50);
		Products products2 = new Products("じゃがいも",100);

		/**
		 * 客の名前と持っている買い物かご
		 */
		Customer customer1 = new Customer("A",cart1);
		Customer customer2 = new Customer("B",cart2);

		/**
		 * 買い物かごに入れる商品の数
		 */
		customer1.insertShoppingCart(products1, 1);
		customer1.insertShoppingCart(products2, 1);
		customer2.insertShoppingCart(products1, 2);
		customer2.insertShoppingCart(products2, 3);

		/**
		 * 買い物をやめる
		 */
		cart1.clearProducts();

		/**
		 * 商品をやめる
		 */
		cart2.removeShopping(products1);

		/**
		 * 表示
		 */
		customer1.printCustomerName();
		customer1.printShoppingCart();
		customer1.printGrandTotalPrice();

		customer2.printCustomerName();
		customer2.printShoppingCart();
		customer2.printGrandTotalPrice();

	}
}