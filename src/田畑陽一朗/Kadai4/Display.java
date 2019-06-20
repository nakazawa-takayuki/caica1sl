package 田畑陽一朗.Kadai4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 商品を買い物かごで管理する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Display {

	public static final String OUTPUT_FILE = "task4.txt";

	public static void main(String[] args) {

		/**
		 * argsに引数を入れている場合fileで
		 */
		if (args.length > 0) {
			outputFile();
		}

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
		 *       お客さんの名前と買った物の情報追加
		 */
		Customer customerA = new Customer("A", cartA);
		customerA.insertShoppingCart(item1, 2);
		customerA.insertShoppingCart(item2, 2);

		Customer customerB = new Customer("B", cartB);
		customerB.insertShoppingCart(item3, 5);
		customerB.insertShoppingCart(item4, 4);

		//表示
		System.out.println("------" + customerA.getCustomerName() + "さんの買い物------");
		customerA.outputShoppingCart();
		customerA.totalPrice();

		System.out.println("------" + customerB.getCustomerName() + "さんの買い物------");
		customerB.outputShoppingCart();
		customerB.totalPrice();
	}

	public static void outputFile() {
		try {
			/** 標準出力の出力先をファイルに切り変える*/
			FileOutputStream fos = new FileOutputStream("OUTPUT_FILE");
			PrintStream ps = new PrintStream(fos);
			/** 出力を切り替える */
			System.setOut(ps);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}