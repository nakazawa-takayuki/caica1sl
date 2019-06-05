package hehangrui.Ex0110;

import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args) {

		//キーボード入力欄
		System.out.println("文字列1");

		Scanner scan1 = new Scanner(System.in);
		String str1 = scan1.nextLine();
		scan1.close();
		System.out.println("文字列2");

		Scanner scan2 = new Scanner(System.in);
		String str2 = scan2.nextLine();
		scan2.close();

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
