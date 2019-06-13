package kanayama.Ex0001.kadai02;

public class Customer {
	private Basket myBasket;
	private String customerName;

	/**
	 *	 コンストラクタ
	 * @param myBasket 買い物かご
	 * @param customerName お客様の名前
	 */
	public Customer(Basket myBasket, String customerName) {
		this.myBasket = myBasket;
		this.customerName = customerName;
	}
	public Customer () {
	}
	/**
	 * 商品名を返却
	 * @return this.myBasket
	 * */
	public Basket getMyBasket(){
		return this.myBasket;
	}
	/**
	 * 商品価格を返却
	 * @return this.customerName
	 * */
	public String getCustomerName(){
		return this.customerName;
	}

}
