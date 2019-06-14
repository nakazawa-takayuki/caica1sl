package kanayama.Ex0001.kadai03;

import java.math.BigDecimal;

/**
 *	 商品情報（商品名、価格）を設定、取得するクラス
 */
public class Product {
	private String productName;
	private int productPrice;

	/**
	 *	 商品名と価格を設定する。
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
			System.out.println(productName + "の価格がマイナス値なので0に設定します。");
		}

		this.productName = productName;
		this.productPrice = productPrice;
	}

	/**
	 * 商品名を設定する。
	 * */
	public void setProductName(String productName) {
		if(productName == null) {
			productName = "未設定";
			System.out.println("商品名が未設定のものがあります");
		}
			this.productName = productName;
	}

	/**
	 * 商品価格を設定する。
	 * */
	public void setProductPrice(int productPrice) {
		if(productPrice < 0) {
			productPrice = 0;
			System.out.println(productName + "の価格がマイナス値なので0に設定します。");
		}
			this.productPrice = productPrice;

	}

	/**
	 * 商品名を取得する。
	 * @return this.productName
	 * */
	public String getProductName(){
		return this.productName;
	}

	/**
	 * 価格を取得する。
	 * @return this.productPrice
	 * */
	public int getProductPrice(){
		return this.productPrice;
	}

	/**
	 * 買い物かご内の商品ごとの小計金額を算出し、商品ごとに詳細を返却する。
	 * @return SubtotalMessage
	 * */
	public String outputDetailProduct(Integer productCount){
		BigDecimal PriceDecimal = new BigDecimal(productPrice);
		BigDecimal CountDecimal = new BigDecimal(productCount);
		String subtotal = String.format("%,.0f",PriceDecimal.multiply(CountDecimal).doubleValue());
		String SubtotalMessage = this.productName + "　単価：" + productPrice + "　×" + productCount + "個 = " + subtotal;
		return SubtotalMessage;
	}


}
