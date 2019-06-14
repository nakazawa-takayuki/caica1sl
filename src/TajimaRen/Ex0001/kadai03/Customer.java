package TajimaRen.Ex0001.kadai03;

/**
 * 【客の名前と客の買い物かご】
 *
 * @author TajimaRen
 */

public class Customer {
	private String customerName;
	private ShoppingCart cart;

	/**
	 * メインクラスでnewされると実行される
	 * 客の名前が「Customer」に入れられる
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

	/**
	 * かごに入っている商品を表示
	 */
	public void printShoppingCart() {
		this.cart.printDetailProducts();
	}

	/**
	 * かごの商品の総計金額を表示
	 */
	public void printGrandTotalPrice() {
		this.cart.printTotalPrice();
	}

	/**
	 * 客が買い物をやめる
	 */
	public void stopShopping() {
		this.cart.clearProducts();
	}

	/**
	 * 客が商品をやめる
	 * @param products
	 */
	public void discardingProducts(Products products) {
		this.cart.removeShopping(products);
	}

	/**
	 * 名前を表示
	 */
	public void printCustomerName() {
		System.out.println(customerName + "さんの買い物かご" + "\n");
	}
}