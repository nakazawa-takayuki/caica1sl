package kanayama.Ex0001.kadai02;
public class Product {
	private String productName;
	private int productPrice;

	/**
	 *	 コンストラクタ
	 * @param productName 商品名
	 * @param productPrice 価格
	 */
	public Product(String productName,int productPrice){

		if(productName == null) {
			productName = "未設定";
		}

		if(productPrice < 0) {
			productPrice = 0;
		}

		this.productName = productName;
		this.productPrice = productPrice;
	}
	/**
	 * 商品名を返却
	 * @return this.productName
	 * */
	public String getProductName(){
		return this.productName;
	}

	/**
	 * 価格を返却
	 * @return this.productPrice
	 * */
	public int getProductPrice(){
		return this.productPrice;
	}
}
