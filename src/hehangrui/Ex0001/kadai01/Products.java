package hehangrui.Ex0001.kadai01;

/**
 * メインクラスから商品の属性を取得し、処理する
 *
 * @author Adrian
 */

public class Products {
	private int price;
	private String name;

	/**
	 * コンストラクター
	 */
	public Products(int price, String name) {
		if(name == null) {
			name = "未設定";
		}
		this.price = price;
		this.name = name;
	}

	/**
	 * 商品の商品名を取得する
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品の商品名を設定する
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 商品の価格を取得する
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 商品の価格を設定する
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 価格と商品名を表示する
	 */
	public void print() {
		System.out.println("商品名 : " + name + "   価格 : " + price + "円");

	}
}