package hehangrui.Ex0114;

import java.util.Scanner;

/**
 * 問題
 * キーボードから文字列を入力し、文字列内の半角空白で単語に分解する.
 * 分解後、単語を逆順で出力する。半角空白が連続で入力された場合は無視する.
 *
 * @author Adrian
 */

public class Ex0114 {

	public static void main(String[] args) {

		//キーボード入力欄
		System.out.println("文字列");

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		//文字のない場合にコメント
		if (str.isEmpty()) {
			System.out.println("文字を入力してください。");
			return;
		}

		//文字列を逆順で出力
		System.out.print("結果：");

		String[] words = str.split("\\s+");
		for (int i = words.length; i > 0; i--) {
			System.out.print(words[i - 1] + " ");
		}
	}
}