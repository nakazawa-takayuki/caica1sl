package 高藝珈.Ex0001.kadai1;

/**
 * 【課題1】
 * 2つの商品の内容を表示してみよう。
 * -商品は"価格"と"商品名"の属性を持ちます。
 * -属性はソース内にベタ書きして構いません。
 * -商品が今後増減することも意識しよう。
 *
 * @author 高藝珈
 */

public class Main {

	int price = 100; // 価格
	String item = "イチゴ"; // 商品名

	/**
	 *	価格を取得する
	 *
	 *	@return price 価格
	 */
	public int getPrice() {
		return price;
	}

	/**
	 *	価格を設定する
	 *
	 *	@param price 価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 *	商品名を取得する
	 *
	 *	@return item 商品名
	 */
	public String getItem() {
		return item;
	}

	/**
	 *	商品名を設定する
	 *
	 *	@param item 商品名
	 */
	public void setItem(String item) {
		this.item = item;
	}

}
