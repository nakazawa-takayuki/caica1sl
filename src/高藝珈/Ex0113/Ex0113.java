package 高藝珈.Ex0113;

import java.util.Scanner;

/**
 * キーボードから文字列を入力し、文字列内に全角数字が含まれる場合は半角数字に置換して出力する。
 *
 * @author 高藝珈
 */

public class Ex0113 {

	public static void main(String[] args) {

		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		input.close();

		if (input1.isEmpty()) {
			System.out.println("入力されていません");
			return;
		}

		String changeInput = convFullWidthToHalfWidth(input1, true);
		System.out.println(changeInput);
	}

	private static String convFullWidthToHalfWidth(String input, boolean flag) {
		String result = "";
		char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int code = chars[i];//get unicode
			if (code >= 65281 && code <= 65373){//the whole alphabet
				result += (char) (chars[i] - 65248);//全角to半角
			} else {
				result += chars[i];
			}
		}
		return result;
	}

}
