package hehangrui.Ex0001.kadai01;

/**
 * 商品の商品名と価格を定義
 * 処理クラスを呼び出し、出力する
 *
 * @author Adrian
 */

public class Main {

	public static void main(String[] args) {

		// Product01をインスタンス化する
		Products item1 = new Products(1000, "林檎");
		Products item2 = new Products(500, "梨");
		Products item3 = new Products(600, "パイン");
		Products item4 = new Products(2000, "スイカ");

		// 商品名と価格を設定する
		item1.setName("林檎");
		item1.setPrice(1000);

		item2.setName("梨");
		item2.setPrice(500);

		item3.setName("パイン");
		item3.setPrice(600);

		item4.setName("スイカ");
		item4.setPrice(2000);

		// 出力する
		item1.print();
		item2.print();
		item3.print();
		item4.print();

	}

}
