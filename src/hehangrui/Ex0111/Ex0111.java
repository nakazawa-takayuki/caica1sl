package hehangrui.Ex0111;

import java.util.Scanner;

/**
 * 問題
 * キーボードから文字列を入力し、文字列内に「① ③ ⑤ ⑦ ⑨」が含まれるか判定する .
 * 含まれる場合は「許可しない文字文字： XX YY 桁目 が含まれます」、
 * 含まれない場合は「許可する文字列です」と出力する.
 *
 * @author Adrian
 */

public class Ex0111 {

	public static void main(String[] args) {

		//配列の宣言
		final String[] BANNED_STRS = { "①", "③", "⑤", "⑦", "⑨" };

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

		//指定の文字が含まれるか判定
		boolean isNiceString = true;
		String[] strArrays = str.split("");
		int count = 1;

		for (String strArray : strArrays) {
			for (String bannedStr : BANNED_STRS) {
				if (strArray.contains(bannedStr)) {
					System.out.println("許可しない文字(文字：" + bannedStr + "  " + count + "桁目)が含まれます");
					isNiceString = false;
				}
			}
			count++;
		}
		if (isNiceString) {
			System.out.println("許可する文字列です。");
		}
	}
}
