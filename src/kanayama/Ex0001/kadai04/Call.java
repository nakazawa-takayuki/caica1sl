package kanayama.Ex0001.kadai04;

import java.io.IOException;
import java.io.PrintStream;

/**
 * メインクラス
 * */
public class Call {

	static PrintStream outputFile;

	public static void main(String args[]) {

		if(args.length ==0) {
			outputFile();
		}

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

		outputFile.close();
	}

	/**
	 * textファイルに出力する
	  */
	public static void outputFile(){
		 try {
	            outputFile = new PrintStream("shopping.txt");
	            System.setOut(outputFile);

	        } catch (IOException e) {
	        	 System.out.println(e);
	        }
	}
}
