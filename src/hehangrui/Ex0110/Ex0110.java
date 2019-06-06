package hehangrui.Ex0110;

import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *キーボードから2 つの文字列を入力し、辞書順で小さい方から値を出力する。
 *同じ値の場合は、「2 つの文字列は同じです」と出力する。
 */

public class Ex0110 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		System.out.println("文字列1");
		String str1 = scan.nextLine();

		System.out.println("文字列2");
		String str2 = scan.nextLine();
		scan.close();

		//文字のない場合にコメント
		if (str1.isEmpty() || str2.isEmpty()) {
			System.out.println("文字を入力してください。");
			return;
		}

		//文字列1と文字列2は同じだと「等しい」と出力、そうでないと比較して、辞書順で出力
		if (str1.compareTo(str2) < 0) {
			System.out.println(str1 + "  " + str2);
		} else if (str1.compareTo(str2) == 0) {
			System.out.println("２つの文字列は同じです -->" + str1);
		} else {
			System.out.println(str2 + "  " + str1);
		}
	}
}
