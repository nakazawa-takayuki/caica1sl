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
		Product01 syohin01 = new Product01(1000, "林檎");
		Product01 syohin02 = new Product01(500, "梨");
		Product01 syohin03 = new Product01(600, "パイン");
		Product01 syohin04 = new Product01(2000, "スイカ");

		// 商品名と価格を設定する
		syohin01.setName("林檎");
		syohin01.setPrice(1000);

		syohin02.setName("梨");
		syohin02.setPrice(500);

		syohin03.setName("パイン");
		syohin03.setPrice(600);

		syohin04.setName("スイカ");
		syohin04.setPrice(2000);

		// 出力する
		syohin01.print();
		syohin02.print();
		syohin03.print();
		syohin04.print();

	}

}
