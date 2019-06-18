package TajimaRen.Ex0001.kadai04;

/**
 * 【商品名と商品価格】
 *
 * @author TajimaRen
 */
public class Products {

	String productsName;		//商品名
	Integer productsPrice = 0;		//商品価格

	/**
	 * メインクラスでnewされると実行される
	 * 商品名と商品価格が「Products」の入れ物に入れられる
	 * @param productsName
	 * @param productsPrice
	 */
	public Products(String productsName,Integer productsPrice) {
		if(productsName == null || productsName == "" || productsName == " " || productsName == "　") {
			this.productsName = "名無し";
		}else {
			this.productsName = productsName;
		}
		if(productsPrice < 0) {
			this.productsPrice = 0;
		}else {
			this.productsPrice = productsPrice;
		}
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