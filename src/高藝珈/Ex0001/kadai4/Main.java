package 高藝珈.Ex0001.kadai4;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 【課題４】
 * 呼び出しクラス
 *
 * @author 高藝珈
 */

public class Main {

	private static final String FILE_NAME = "ShoppingResult.txt";

	public static void main(String[] args) {

		//コンソールとファイル出力は、起動パラメータで変更する。
		if (args.length != 0) {
			// 出力先切り替え
			outputFile();
		}

		Goods goodsA = new Goods("いちご", 100);
		Goods goodsB = new Goods("メロン", 500);

		Basket basketA = new Basket();
		Basket basketB = new Basket();

		Customer customerA = new Customer("A", basketA);
		Customer customerB = new Customer("B", basketB);

		customerA.insertBasket(goodsA, 1);
		customerB.insertBasket(goodsA, 1);
		customerB.insertBasket(goodsB, 8);

		customerA.emptyBasket(customerA.getCustomerName());
		customerA.displayBasket(customerA.getCustomerName());

		customerB.removePartGood(customerB.getCustomerName(), goodsA);
		customerB.displayBasket(customerB.getCustomerName());
	}

	public static void outputFile() {
		try {
			// ShoppingResult.txt に出力する PrintStream を生成
			PrintStream out = new PrintStream(FILE_NAME);
			//置き換える
			System.setOut(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
