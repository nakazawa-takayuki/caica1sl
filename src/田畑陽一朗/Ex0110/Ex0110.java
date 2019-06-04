package 田畑陽一朗.Ex0110;

import java.util.Scanner;
/*
 * 入力された文字列を出力します。
 * 入力された文字列を辞書順に並び替えます。
 *
 * @author 田畑 陽一朗
 */

public class Ex0110 {

	private static Scanner sc1;

	public static void main(String[] args) {

		sc1 = new Scanner(System.in);
		System.out.println("文字列1:");
		String line1 = sc1.nextLine();
		System.out.println("文字列2:");
		String line2 = sc1.nextLine();

		if (line1.equals("") || line2.equals("") || line1 == null || line2 ==null) {
			System.out.println("文字を入力してください");
			}

		else if (line1.compareTo(line2) < 0) {
			System.out.println(line1 + " " + line2);
		} else if (line1.compareTo(line2) > 0) {
			System.out.println(line2 + " " + line1);
		} else if (line1.equals(line2)) {
			System.out.println("2つの文字列は同じです");
		}
	}
}