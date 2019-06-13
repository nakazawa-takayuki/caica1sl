package TajimaRen.Ex0001.kadai01;

/**
 * 商品クラス
 *
 * @author TajimaRen
 */
public class Products {
	private String productsName;		//商品名
	private Integer productsPrice;		//商品価格

	/**
	 *コンストラクタ
	 * @param name
	 * @param price
	 */
	public Products(String name,Integer price) {
		productsName = name;
		productsPrice = price;
	}

	/**
	 * 商品名と価格を表示
	 */
	public void print() {
		System.out.println("商品名：" + productsName);
		System.out.println("価格：" + productsPrice);
	}
}