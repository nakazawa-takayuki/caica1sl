package 田畑陽一朗.Kadai3;

/**
 * 商品を買い物かごで管理する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Main {

	public static void main(String[] args) {

		/**
		 *      商品名と価格の設定
		 */
		Item item1 = new Item("マグロ", 3000);
		Item item2 = new Item("カニ", 4500);
		Item item3 = new Item("カレイ", 1500);
		Item item4 = new Item("ヒラメ", 2000);

		/**
		 *     商品を入れる買い物かご作成
		 */
		ShoppingCart cartA = new ShoppingCart();
		ShoppingCart cartB = new ShoppingCart();

		/**
		 *    お客さんの名前と買った物の情報追加
		 */
		Customer customerA = new Customer("A", cartA);
		customerA.insertShoppingCart(item1, 2);
		customerA.insertShoppingCart(item2, 2);

		Customer customerB = new Customer("B", cartB);
		customerB.insertShoppingCart(item3, 5);
		customerB.insertShoppingCart(item4, 4);

		/**
		 * Aさんのかごを全削除、Bさんのかごから指定の商品を削除
		 */
		System.out.println("------Aさんの買い物------");
		customerA.outputShoppingCart();
		//買い物かごの中身を全削除
		customerA.clearCartItem();
		customerA.totalPrice();

		System.out.println("-----Bさんの買い物------");
		customerB.outputShoppingCart();

		// 買い物かごの中から指定の商品を削除
		customerB.removeCartItem(item3);
		customerB.totalPrice();
	}
}