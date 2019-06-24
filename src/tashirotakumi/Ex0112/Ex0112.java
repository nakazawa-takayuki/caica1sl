package tashirotakumi.Ex0112;

import java.util.Scanner;

public class Ex0112 {
	private static final String HAS_HALF_KANA = ".*[\\uFF61-\\uFF9F]+.*";

	public static void main(String[] args) {

		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr = scan.nextLine(); //キーボードからの入力
		scan.close();

		if (CheckhalfSize(inputStr)) {
			System.out.println("許可する文字列です");
		} else {
			System.out.println("半角カナが含まれます");
		}
	}
	public static boolean CheckhalfSize(String str) {
			return !str.matches(HAS_HALF_KANA);
	}
}