package kanayama.Ex0001.kadai01;

/*
 * 【課題1】
 * 2つの商品の内容を表示してみよう。
 * -商品は"価格"と"商品名"の属性を持ちます。
 * -属性はソース内にベタ書きして構いません。
 * -商品が今後増減することも意識しよう。
 */
public class Product {
	private String productName;
	private int productPrice;

	public void setProductName(String productName){
		this.productName = productName;
	}
	public void setProductPrice(int productPrice){
		this.productPrice = productPrice;
	}
	public String getProductName(){
		return this.productName;
	}
	public int getProductPrice(){
		return this.productPrice;
	}

}
