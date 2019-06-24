package tashirotakumi.Ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {
		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr = scan.nextLine(); //キーボードからの入力
		scan.close();
		specificCharacter(inputStr);
	}

	private static void specificCharacter(String inputStr) {
		char[]  conversionChar= inputStr.toCharArray();
		final char[] TARGET_CHAR_ARRAY = { '①', '③', '⑤', '⑦', '⑨' };
		boolean x = true;
		for (int i = 0; i < inputStr.length(); i++) {
			for (int j = 0; j < TARGET_CHAR_ARRAY .length; j++) {
				if (conversionChar[i] == TARGET_CHAR_ARRAY [j]) {
					x = false;
					System.out.println("許可しない文字（文字：" + conversionChar[i] + (i + 1) + "桁目）が含まれます");
				}
			}
		}
		if (x) {
			System.out.println("許可する文字列です");
		}
	}
}
