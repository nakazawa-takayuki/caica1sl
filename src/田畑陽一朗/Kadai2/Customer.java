package 田畑陽一朗.Kadai2;

/**
 * 顧客の名前とかごの中身を返す。
 *
 * @author 田畑 陽一朗
 *
 */
public class Customer {
	/**
	 * 顧客の名前
	 */
	private String customerName;
	/**
	 * かごの中身
	 */
	private ShoppingCart shoppingCart;

	/**
	 * 顧客の名前とかごの中身を初期化する
	 * @param customerName
	 * @param shoppingCart
	 */
	public Customer(String customerName, ShoppingCart shoppingCart) {
		this.customerName = customerName;
		this.shoppingCart = shoppingCart;
	}

	/**
	 * 
	 * @param item
	 * @param itemCount
	 */
	public void insertShoppingCart(Item item, Integer itemCount) {
		this.shoppingCart.putCart(item, itemCount);
	}

	/**
	 * 
	 */
	public void totalPrice() {
		this.shoppingCart.calcTotalPrice();
	}

	/**
	 * 
	 */
	public void outputShoppingCart() {
		this.shoppingCart.displayItem();
	}

	/**
	 * 顧客の名前を取得
	 * @return 顧客の名前
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * かごの名前を取得
	 * @return かごの名前
	 */
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
}
