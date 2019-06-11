package 高藝珈.Ex0114;

import java.util.Scanner;

/**
 * キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。
 * 分解後、単語を逆順で出力する。半角空白が連続で入力された場合は無視する。
 *
 * @author 高藝珈
 */

public class Ex0114 {

	public static void main(String[] args) {

		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		input.close();

		if (input1.isEmpty()) {
			System.out.println("入力されていません");
			return;
		}

		String[] words = input1.split("\\s+");
		System.out.println("結果： ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

}
