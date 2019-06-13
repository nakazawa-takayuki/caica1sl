package TajimaRen.Ex0001.kadai01;

/**
 * メインクラス
 *
 * @author TajimaRen
 */

public class ProductsCall {
	public static void main(String args[]){
		Products products1 = new Products("にんじん",50);
		Products products2 = new Products("じゃがいも",100);

		products1.print();
		products2.print();
	}
}