package kanayama.Ex0001.kadai02;

public class Customer {
	private Basket myBasket;
	private String customerName;

	/**
	 *	 買い物かご、顧客の名前を設定するクラス
	 * @param myBasket 買い物かご
	 * @param customerName 顧客の名前
	 */
	public Customer(Basket myBasket, String customerName) {

		if(myBasket == null) {
			myBasket = null;
			System.out.println("商品名が未設定のものがあります");
		}

		if(customerName == null) {
			customerName = "未設定";
			System.out.println("顧客の名前が未設定です");
		}
		this.myBasket = myBasket;
		this.customerName = customerName;

	}
	/**
	 *	 買い物かご、顧客の名前を設定するクラス
	 * <br>引数なし
	 */
	public Customer () {
	}

	/**
	 * 買い物かごの中身を設定
	 * */
	public void setMyBasket(Basket myBasket) {
		this.myBasket = myBasket;
	}

	/**
	 * 顧客の名前を設定
	 * */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 買い物かごの中身を取得
	 * @return this.myBasket
	 * */
	public Basket getMyBasket(){
		return this.myBasket;
	}

	/**
	 * 顧客の名前を取得
	 * @return this.customerName
	 * */
	public String getCustomerName(){
		return this.customerName;
	}

}
