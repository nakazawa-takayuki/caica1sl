package hehangrui.Ex0001.kadai01;

/**
 * メインクラスから商品の属性を取得し、処理する
 *
 * @author Adrian
 */

public class Product01 {
	private int price;
	private String name;

	/**
	 * コンストラクター
	 */
	public Product01(int _price,String _name) {
		price = _price;
		name = _name;
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
	 * 内容表示
	 */
	public void print() {
		System.out.printf("商品名 : " + name + "   ");
		System.out.println("価格 : " + price + "円");

	}
}
