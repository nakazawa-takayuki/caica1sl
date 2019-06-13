package kanayama.Ex0001.kadai02;
public class Product {
	private String productName;
	private int productPrice;

	/**
	 *	 商品名と価格を設定するクラス
	 * @param productName 商品名
	 * @param productPrice 価格
	 */
	public Product(String productName,int productPrice){

		if(productName == null) {
			productName = "未設定";
			System.out.println("商品名が未設定のものがあります");
		}

		if(productPrice < 0) {
			productPrice = 0;
			System.out.println(productName + "の価格がマイナス値です");
		}

		this.productName = productName;
		this.productPrice = productPrice;
	}

	/**
	 * 商品名を設定
	 * */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 商品価格を設定
	 * */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * 商品名を取得
	 * @return this.productName
	 * */
	public String getProductName(){
		return this.productName;
	}

	/**
	 * 価格を取得
	 * @return this.productPrice
	 * */
	public int getProductPrice(){
		return this.productPrice;
	}
}
