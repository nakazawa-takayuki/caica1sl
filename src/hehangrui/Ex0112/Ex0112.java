package hehangrui.Ex0112;

import java.util.Scanner;

public class Ex0112 {

	public static void main(String[] args) {

		//キーボード入力欄
		System.out.println("文字列");

		Scanner scan = new Scanner(System.in);
		String moji = scan.nextLine();
		scan.close();

		//半角カナが含まれるか判定
		char[] chars_moji = moji.toCharArray();

		boolean HalfWidth = true;
		for (int i = 0; i < chars_moji.length; i++) {
			if (String.valueOf(chars_moji[i]).matches(".*[\\uFF61-\\uFF9F]+.*")) {
				System.out.println("半角カナが含まれます");
			}
		}
		if (HalfWidth) {
			System.out.println("許可する文字列です。");
		}
	}
}
