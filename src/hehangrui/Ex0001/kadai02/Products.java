package hehangrui.Ex0001.kadai02;

/**
 * メインクラスから商品の属性を取得し、処理する
 *
 * @author Adrian
 */

public class Products {
	private String productName;
	private int productPrice;

	/**
	 * 商品の商品名を取得する
	 * @return
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 商品の商品名を設定する
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 商品の価格を取得する
	 * @return
	 */
	public int getProductPrice() {
		return productPrice;
	}

	/**
	 * 商品の価格を設定する
	 * @param productPrice
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}