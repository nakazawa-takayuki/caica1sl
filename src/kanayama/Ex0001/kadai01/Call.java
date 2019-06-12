package kanayama.Ex0001.kadai01;

/*
 * 【課題1】
 * 2つの商品の内容を表示してみよう。
 * -商品は"価格"と"商品名"の属性を持ちます。
 * -属性はソース内にベタ書きして構いません。
 * -商品が今後増減することも意識しよう。
 */
public class Call {
	public static void main(String srgs[]) {

		Product productValue = new Product();

		productValue.setProductName("人参");
		productValue.setProductPrice(1000);

		System.out.println("商品名：" + productValue.getProductName());
		System.out.println("価格：" + productValue.getProductPrice() + "円");
	}
}
