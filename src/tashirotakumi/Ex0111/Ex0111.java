package tashirotakumi.Ex0111;

import java.util.Scanner;

public class Ex0111 {
	private static final char[] TARGET_CHAR_ARRAY = { '①', '③', '⑤', '⑦', '⑨' };

	public static void main(String[] args) {
		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr = scan.nextLine(); //キーボードからの入力
		scan.close();
		specificCharacter(inputStr);
	}

	/**
	 * specificCharacterメソッド
	 * 入力された文字列に定数に格納された値と、
	 * 同じものが存在するか確認しそれに応じた結果を出力する
	 * @param inputStr 入力された文字列
	 */
	private static void specificCharacter(String inputStr) {
		char[] conversionChar = inputStr.toCharArray();

		boolean isPermit = true;
		for (int i = 0; i < inputStr.length(); i++) {
			for (int j = 0; j < TARGET_CHAR_ARRAY.length; j++) {
				if (conversionChar[i] == TARGET_CHAR_ARRAY[j]) {
					isPermit = false;
					System.out.println("許可しない文字（文字：" + conversionChar[i] + (i + 1) + "桁目）が含まれます");
				}
			}
		}
		if (isPermit) {
			System.out.println("許可する文字列です");
		}
	}
}
