package tashirotakumi.Ex0112;

import java.util.Scanner;

public class Ex0112 {
	private static final String HAS_HALF_KANA = ".*[\\uFF61-\\uFF9F]+.*";

	public static void main(String[] args) {

		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr = scan.nextLine(); //キーボードからの入力
		scan.close();

		if (checkhalfSize(inputStr)) {
			System.out.println("許可する文字列です");
		} else {
			System.out.println("半角カナが含まれます");
		}
	}

	/**
	 * CheckhalfSizeメソッド
	 * 入力された文字列に半角カナが含まれているか確認する
	 * @param str 入力された文字列
	 * @return 半角カナが含まれているか確認した結果を返す
	 */
	public static boolean checkhalfSize(String str) {
		return !str.matches(HAS_HALF_KANA);
	}
}