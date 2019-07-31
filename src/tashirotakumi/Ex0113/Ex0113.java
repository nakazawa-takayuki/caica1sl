package tashirotakumi.Ex0113;

import java.util.Scanner;

public class Ex0113 {
	public static void main(String[] args) {
		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr = scan.nextLine();
		scan.close();

		inputStr = checkNumberHalfSize(inputStr);
		System.out.println(inputStr);
	}

	/**
	 * checkNumberHalfSizeメソッド
	 * 入力された文字列に全角数字が入力されている場合に半角に変更する
	 * @param input 入力された文字列
	 * @return 全角数字を半角に変換後の文字列
	 */
	public static String checkNumberHalfSize(String inputStr) {
		StringBuffer sb = new StringBuffer(inputStr);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c >= '０' && c <= '９') {
				sb.setCharAt(i, (char) (c - '０' + '0'));
			}
		}
		return sb.toString();
	}
}
