package hehangrui.Ex0001.kadai01;

/**
 * 商品の商品名と価格を定義
 * 処理クラスを呼び出し、出力する
 *
 * @author Adrian
 */

public class Main_Kadai01 {

	public static void main(String[] args) {

		// Product01をインスタンス化する
		Product01 item01 = new Product01(1000, "林檎");
		Product01 item02 = new Product01(500, "梨");
		Product01 item03 = new Product01(600, "パイン");
		Product01 item04 = new Product01(2000, "スイカ");

		// 商品名と価格を設定する
		item01.setName("林檎");
		item01.setPrice(1000);

		item02.setName("梨");
		item02.setPrice(500);

		item03.setName("パイン");
		item03.setPrice(600);

		item04.setName("スイカ");
		item04.setPrice(2000);

		// 出力する
		item01.print();
		item02.print();
		item03.print();
		item04.print();

	}

}
