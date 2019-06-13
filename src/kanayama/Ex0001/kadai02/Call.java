package kanayama.Ex0001.kadai02;

/*
 * 【課題2】
 * 課題2の商品を買い物かごで管理しよう。
 * -買い物かごは「かごに入れる」「かごに入っている商品を表示する」「合計金額を計算する」の機能を持ちます。
 * -買い物する人、商品はベタ書きして構いません。
 * -買い物する人と商品は n個 とします。
 * 	-イメージとしては
 * 		1.Aさんが買い物を始める
 * 		2.買い物かごに商品X、商品Yを入れる
 * 		3.Aさんの買い物かごの一覧と合計金額を表示する
 * 		1.Bさんが買い物を始める
 * 		3.買い物かごに商品X、商品Yを2個、商品Zを3個入れる
 * 		3.Bさんの買い物かごの一覧と合計金額を表示する
 */
public class Call {
	public static void main(String srgs[]) {
		//商品
		Product productValueX = new Product("ニンジン",1000);
		Product productValueY = new Product("トマト",2000);
		Product productValueZ = new Product("ナス",1500);

		//買い物かご
		Basket basketA = new Basket();
		Basket basketB = new Basket();
		//商品をかごに入れる
		basketA.putBasket(productValueX,1);
		basketA.putBasket(productValueY,2);
		basketB.putBasket(productValueX,1);
		basketB.putBasket(productValueY,2);
		basketB.putBasket(productValueZ,3);

		//顧客
		Customer customerA = new Customer(basketA,"A");
		Customer customerB = new Customer(basketB,"B");

		//表示
		basketA.displayBasket(customerA.getCustomerName());
		basketA.displayTotalPrice();
		basketB.displayBasket(customerB.getCustomerName());
		basketB.displayTotalPrice();
	}
}
