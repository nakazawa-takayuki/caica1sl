package hehangrui.Ex0115;

import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。
 *分解後、単語の出力順序が偶数と奇数でそれぞれ結合して出力する。
 */

public class Ex0115 {

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

		//単語の出力順序が偶数と奇数でそれぞれ結合して出力
		String[] words = str.split("\\s+");
		String OddNumber = "";
		String EvenNumber = "";

		for (int i = 0; i < words.length; i++) {
			if ((i + 1) % 2 != 0) {
				OddNumber += words[i] + " ";
			} else {
				EvenNumber += words[i] + "   ";
			}
		}
		System.out.println("奇数番目：" + OddNumber);
		System.out.println("偶数番目：" + EvenNumber);
		return;
	}
}
