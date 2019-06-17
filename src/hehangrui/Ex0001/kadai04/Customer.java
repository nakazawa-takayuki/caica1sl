package hehangrui.Ex0001.kadai04;

/**
 * メインクラスから顧客の属性を取得し、処理する
 *
 * @author Adrian
 */
public class Customer {
	private String customerName;
	private ShoppingCart shoppingCart;

	/**
	 * 顧客の名前を取得する
	 * @return
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * 顧客の名前を設定する
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 顧客のかごを取得する
	 * @return
	 */
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	/**
	 * 顧客のかごを設定する
	 * @param shoppingCart
	 */
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	/**
	 * 顧客の名前を出力する
	 */
	public void printCustomerName() {
		System.out.print(customerName);
	}

	/**
	 * 買い物かごの中身を空にする
	 */
	public void NotBuyCustomer() {
		System.out.println("さんが買い物をやめました。");
		this.shoppingCart.disposalShopping();
	}

	/**
	 * 一部の商品をやめる
	 */
	public void disposalItem(Products products) {
		this.shoppingCart.disposalItem(products);
	}

	/**
	 * 顧客がかごに商品を入れる
	 */
	public void displayItem() {
		this.shoppingCart.displayItem();
	}

	/**
	 * 合計金額
	 */
	public void calcPrice() {
		this.shoppingCart.calcPrice();
	}
}