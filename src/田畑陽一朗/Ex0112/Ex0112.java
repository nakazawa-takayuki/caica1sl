package 田畑陽一朗.Ex0112;

import java.util.Scanner;

/**
*
* キーボードから文字列を入力し、文字列内に半角カナが含まれるか判定する 。
* 含まれる場合は「半角カナが含まれます」、含まれない場合は「許可する文字列です」と 出力する。
*
* @author 田畑 陽一朗
*
*/
public class Ex0112 {

	private static Scanner scn;

	private static boolean judge(char[] chars) {
		boolean result = true;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (c >= '\uff61' && c <= '\uff9f') {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		scn = new Scanner(System.in);
		System.out.println("文字列:");
		String line1 = scn.nextLine();

		if (line1.equals("") || line1 == null) {
			System.out.println("文字を入力してください。");
			return;
		} else {
			System.out.println("この文字列" + line1 + "は許可されますか。\n\n");

			char[] chars = line1.toCharArray();
			if (judge(chars)) {
				System.out.println("許可する文字列です");
			} else {
				System.out.println("半角カナが含まれます");
			}
		}

	}
}