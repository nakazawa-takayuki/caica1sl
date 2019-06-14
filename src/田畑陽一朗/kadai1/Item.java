package 田畑陽一朗.kadai1;

public class Item {

	private String itemName; //商品名
	private int price; //価格

	/**
	 * 商品の名前を取得
	 * @return 商品名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 価格を取得
	 * @return 価格
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 商品名と価格を初期化する
	 * @param itemName
	 * @param price
	 */
	public Item(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}

	/**
	 * オーバーライドして文字を出力
	 */
	@Override
	public String toString() {
		return itemName + ":" + Integer.toString(price) + "円";
	}
}
