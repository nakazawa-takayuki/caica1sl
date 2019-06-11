package 高藝珈.Ex0112;

import java.util.Scanner;

/**
 * キーボードから文字列を入力し、文字列内に半角カナが含まれるか判定する。
 * 含まれる場合は「半角カナが含まれます」、含まれない場合は「許可する文字列です」と出力する。
 *
 * @author 高藝珈
 */

public class Ex0112 {

	public static void main(String[] args) {

		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		input.close();

		if (input1.isEmpty()) {
			System.out.println("入力されていません");
			return;
		}
		System.out.println(input1 + "は許可されますか\n");

		if (input1.matches(".*[\\uFF61-\\uFF9F]+.*")) {
			System.out.println("半角カナが含まれます。");
		} else {
			System.out.println("許可する文字列です。");
		}
	}

}