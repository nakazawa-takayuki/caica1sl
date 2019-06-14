package kanayama.Ex0001.kadai04;

/**
 *
 * 顧客の名前、買い物かごを設定、取得するクラス
 * */
public class Customer {
	private Basket myBasket;
	private String customerName;

	/**
	 *	 買い物かご、顧客の名前を設定する。
	 * @param myBasket 買い物かご
	 * @param customerName 顧客の名前
	 */
	public Customer(Basket myBasket, String customerName) {

		if(myBasket == null) {
			myBasket = null;
			System.out.println("買い物かごに入っていません。");
		}

		if(customerName == "") {
			customerName = "未設定";
			System.out.println("顧客の名前が未設定です。");
		}

		this.myBasket = myBasket;
		this.customerName = customerName;
	}

	/**
	 *	 買い物かご、顧客の名前を設定する。
	 * <br>引数なし
	 */
	public Customer () {
	}

	/**
	 * 買い物かごの中身を設定する。
	 * */
	public void setMyBasket(Basket myBasket) {
		if(myBasket == null) {
			myBasket = null;
			System.out.println("買い物かごに入っていません。");
		}
			this.myBasket = myBasket;
	}

	/**
	 * 顧客の名前を設定する。
	 * */
	public void setCustomerName(String customerName) {
		if(customerName == null) {
			customerName = "未設定";
			System.out.println("顧客の名前が未設定です");
		}
			this.customerName = customerName;
	}

	/**
	 * 買い物かごの中身を取得する。
	 * @return this.myBasket
	 * */
	public Basket getMyBasket(){
		return this.myBasket;
	}

	/**
	 * 顧客の名前を取得する。
	 * @return this.customerName
	 * */
	public String getCustomerName(){
		return this.customerName;
	}

	/**
	 * 	購入商品、個数を追加するメソッド putBasket(Product product,int count) に遷移する。
	 *
	 * */
	public void insertCustomerBasket(Product product,int count) {
		this.myBasket.putBasket(product,count);
	}

	/**
	 * 顧客名、購入商品を表示するメソッド displayBasket(String customerName) に遷移する。
	 *
	 * */
	public void outputBasketDispiay() {
		this.myBasket.displayBasket(this.customerName);
	}

	/**
	 * 商品をキャンセルするメソッド displayBasket(String customerName) に遷移する。
	 *
	 * */
	public void callRemoveProduct(Product productValueX) {
		myBasket.removeProduct(productValueX);
	}

	/**
	 * 買い物をやめるメソッド removeProduct(Product product) に遷移する。
	 *
	 * */
	public void callRemoveShopping() {
		myBasket.removeShopping();
	}
}
