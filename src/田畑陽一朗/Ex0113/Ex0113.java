package 田畑陽一朗.Ex0113;

import java.util.Scanner;

/**
* キーボードから文字列を入力し、文字列内に全角数字が含まれる場合は半角数字に置換して出力する 。
*
* @author 田畑 陽一朗
*
*/
public class Ex0113 {

	private static Scanner scn;

	public static void main(String[] args) {

		scn = new Scanner(System.in);
		System.out.println("文字列:");
		String line1 = scn.nextLine();

		if (line1.equals("") || line1 == null) {
			System.out.println("文字を入力してください。");
			return;
		}

		StringBuilder sb = new StringBuilder(line1);
		for (int i = 0; i < sb.length(); i++) {
			int c = (int) sb.charAt(i);
			if (c >= 0xFF10 && c <= 0xFF19) {
				sb.setCharAt(i, (char) (c - 0xFEE0));

			}
		}
		System.out.println(sb);
		return;
	}
}