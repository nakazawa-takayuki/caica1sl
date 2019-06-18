package TajimaRen.Ex0001.kadai04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * メインクラス
 *
 * @author TajimaRen
 */

public class ShoppingMain {

	public static void main(String[] args) throws FileNotFoundException {

		/**
		 * 買い物かご
		 */
		ShoppingCart cart1 = new ShoppingCart();
		ShoppingCart cart2 = new ShoppingCart();

		/**
		 * 商品名と商品価格
		 */
		Products products1 = new Products("にんじん",50);
		Products products2 = new Products(" ",100);

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
		customer1.stopShopping();

		/**
		 * 商品をやめる
		 */
		customer2.discardingProducts(products1);

		/**
		 * 表示
		 */
		if(args.length == 0) {
			//コンソール出力を保持する
			PrintStream sysOut = System.out;


			//コンソール出力の出力先をファイルに切り変える
			//エラー：FileNotFoundException
			FileOutputStream fos = new FileOutputStream("Shopping.txt");
			PrintStream ps = new PrintStream(fos);

			System.setOut(ps);

			//出力
			customer1.printCustomerName();
			customer1.printShoppingCart();
			customer1.printGrandTotalPrice();

			customer2.printCustomerName();
			customer2.printShoppingCart();
			customer2.printGrandTotalPrice();

			ps.close();
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}else {
			//出力
			customer1.printCustomerName();
			customer1.printShoppingCart();
			customer1.printGrandTotalPrice();

			customer2.printCustomerName();
			customer2.printShoppingCart();
			customer2.printGrandTotalPrice();
		}
	}
}