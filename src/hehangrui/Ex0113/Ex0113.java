package hehangrui.Ex0113;

import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *キーボードから文字列を入力し、文字列内に全角数字が含まれる場合は半角数字に置換して出力する 。
 */

public class Ex0113 {

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

		//全角数字を半角数字に置換
		StringBuffer str1 = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '０' && c <= '９') {
				str1.setCharAt(i, (char) (c - '０' + '0'));
			}
		}
		System.out.println("結果：" + str);
		return;
	}
}
