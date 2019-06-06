package hehangrui.Ex0112;

import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *キーボードから文字列を入力し、文字列内に半角カナが含まれるか判定する 。
 *含まれる場合は「半角カナが含まれます」、含まれない場合は「許可する文字列です」と 出力する。
 */

public class Ex0112 {

	public static void main(String[] args) {

		//キーボード入力欄
		System.out.println("文字列");

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		//文字のない場合にコメント
		if (str.isEmpty()) {
			System.out.println("文字を入力してください。");
			return;
		}

		//半角カナが含まれるか判定
		char[] CharsMoji = str.toCharArray();

		boolean HalfWidth = true;
		for (int i = 0; i < CharsMoji.length; i++) {
			if (String.valueOf(CharsMoji[i]).matches(".*[\\uFF61-\\uFF9F]+.*")) {
				System.out.println("半角カナが含まれます");
				return;
			}
		}
		if (HalfWidth) {
			System.out.println("許可する文字列です。");
		}
	}
}
