package TajimaRen.Ex0001.kadai02;

/**
 * 【商品名と商品価格】
 *
 * @author TajimaRen
 */
public class Products {

	String productsName;		//商品名
	Integer productsPrice;		//商品価格

	/**
	 *コンストラクタ
	 * @param productsName
	 * @param productsPrice
	 */
	public Products(String productsName,Integer productsPrice) {
		this.productsName = productsName;
		this.productsPrice = productsPrice;
	}

	public String getProductsName() {
		return productsName;
	}

	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}

	public Integer getProductsPrice() {
		return productsPrice;
	}

	public void setProductsPrice(Integer productsPrice) {
		this.productsPrice = productsPrice;
	}

	/**
	 * かごに入れた一種類の商品の合計金額を計算する
	 * @param productsPrice
	 * @param count
	 */
	public double calcCart(Integer productsCount) {
		return productsPrice * productsCount;
	}
}