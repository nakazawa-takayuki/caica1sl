package 田畑陽一朗.Kadai4;

/**
 * 商品の名前と価格を返す
 *
 * @author 田畑 陽一朗
 *
 */
public class Item {
	/**
	 * 商品名のフィールドを作成
	 */
	private String itemName; //商品名
	/**
	 * 価格のフィールドを作成
	 */
	private int price; //価格

	/**
	 * 商品の名前を取得
	 * @return 商品名
	 */
	public String getItemName() {
		if (itemName.isEmpty()) {
			System.out.println("商品名を入力してください");
		}
		return itemName;
	}

	/**
	 * 価格を取得
	 * @return 価格
	 */
	public int getPrice() {
		if (price < 0) {
			System.out.println("-の価格が入力されています。");
			System.exit(0);
		}
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
}
