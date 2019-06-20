package 高藝珈.Ex0115;

import java.util.Scanner;

/**
 * キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。
 * 分解後、単語の出力順序が偶数と奇数でそれぞれ結合して出力する。
 *
 * @author 高藝珈
 */

public class Ex0115 {

	public static void main(String[] args) {

		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		input.close();

		if (input1.isEmpty()) {
			System.out.println("入力されていません");
			return;
		}

		String[] str = input1.split("\\s+");
		String oddPosition = "";
		String evenPosition = "";

		for (int index = 0; index < str.length; index++) {
			if ((index + 1) % 2 != 0) {
				oddPosition = oddPosition + str[index] + " ";
			} else {
				evenPosition = evenPosition + str[index] + " ";
			}
		}
		System.out.println("奇数番号 : " + oddPosition);
		System.out.println("偶数番号 : " + evenPosition);
		return;
	}
}
