package 高藝珈.Ex0001.kadai2;

/**
 * 【課題2】
 * お商品の価格と商品名の設定と取得
 *
 * @author 高藝珈
 */

public class Goods {

	public int price; // 価格
	public String item; // 商品名

	public Goods(String item, int price) {
		this.item = item;
		this.price = price;
	}

	/**
	 *
	 * @param itemNum
	 * @return
	 */
	public String outputGoodsDetail(Integer itemNum) {
		if (price < 0) {
			System.out.println("正しい価格を入力してください。");
			System.exit(0);
		}
		if (item.equals("")) {
			item = "なし";
		}
		return "商品：" + this.item + " 単価：" + this.price + " 個数：" + itemNum + " 合計：" + this.price * itemNum;

	}

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
