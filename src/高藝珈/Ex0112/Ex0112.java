package 高藝珈.Ex0112;

import java.util.Scanner;

public class Ex0112 {

	public static void main(String[] args) {
		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		input.close();

		char[] chars_str1 = str1.toCharArray();
		boolean hasHalfKana = true;

		for (int i = 0; i < chars_str1.length; i++) {

			String temp = String.valueOf(chars_str1[i]);

			if (temp.matches(".*[\\uFF61-\\uFF9F]+.*")) {

				System.out.println("半角カナが含まれます。");
				return;
			}

		}
		if (hasHalfKana) {
			System.out.println("許可する文字列です。");

		}
	}

}