package 高藝珈.Ex0001.kadai1;

/**
 * 【課題1】
 *
 * @author 高藝珈
 */

public class Main {

	public static void main(String[] args) {

		Goods goodsA = new Goods("いちご", 100);
		System.out.println("商品名は" + goodsA.getItem() + "," + "価格は" + goodsA.getPrice());
	}
}
