package 田畑陽一朗.kadai1;

public class Main {

	public static void main(String[] args) {

		/**
		 *      商品名と価格の設定
		 */
		Item item1 = new Item("マグロ", 3000);
		Item item2 = new Item("カニ", 4500);

		/**
		 *      商品名と価格を表示
		 */
		System.out.println(item1);
		System.out.println(item2);
	}
}
