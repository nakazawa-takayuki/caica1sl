package TajimaRen.Ex0001.kadai02;

/**
 * 【客の名前と客の買い物かご】
 *
 * @author TajimaRen
 */

public class Customer {
	private String customerName;
	private ShoppingCart cart;

	/**
	 * コンストラクタ
	 * @param customerName
	 * @param cart
	 */
	public Customer(String customerName,ShoppingCart cart){
		this.customerName = customerName;		//客の名前
		this.cart = cart;						//客が持っている買い物かご
	}

	public String getName() {
		return customerName;
	}

	public void setName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 客が買い物かごに商品を入れる
	 * @param products
	 * @param productsCount
	 */
	public void insertShoppingCart(Products products, Integer productsCount) {
		this.cart.putCart(products, productsCount);
	}

	public void printCustomerName() {
		System.out.println(customerName + "さんの買い物かご" + "\n");
	}
}