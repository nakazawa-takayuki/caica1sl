package 高藝珈.Ex0001.kadai2;

/**
 * 【課題2】
 * お客様の名前とかごの設定と取得
 *
 * @author 高藝珈
 */

public class Customer {

	public String customerName;
	public Basket basket;

	public Customer(String customerName, Basket basket) {
		this.customerName = customerName;
		this.basket = basket;
	}

	/**
	 *	お客様の名前を取得する
	 *
	 *	@return お客様の名前
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 *	お客様の名前を設定する
	 *
	 *	@param お客様の名前
	 */
	public void setName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 *	お客様のかごを取得する
	 *
	 *	@return かご
	 */
	public Basket getBasket() {
		return basket;
	}

	/**
	 *	お客様のかごを設定する
	 *
	 *	@param  かご
	 */
	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	/**
	 * 買い物かごに商品を指定個数入れる
	 *
	 * @param goods
	 * @param itemNum
	 */
	public void insertBasket(Goods goods, Integer itemNum) {
		this.basket.putBasket(goods, itemNum);
	}

}
