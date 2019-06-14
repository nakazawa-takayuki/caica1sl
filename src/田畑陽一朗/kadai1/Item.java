package 田畑陽一朗.kadai1;

public class Item {

	private String itemName; //商品名
	private int price; //価格

	public String getItemName() {
		return itemName;
	}

	public int getPrice() {
		return price;
	}

	public Item(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public String toString() {
		return itemName + ":" + Integer.toString(price) + "円";
	}
}
