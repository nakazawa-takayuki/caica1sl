//全体を通してコメントアウトは後日追加いたします。
package tashirotakumi.Ex0110;

import java.util.Scanner;

public class Ex0110 {
	public static void main(String[] args) {
		System.out.println("文字列1：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr1 =scan.nextLine();
		System.out.println("文字列2：");
		String inputStr2 = scan.nextLine(); //キーボードからの入力
		scan.close();
		sortDicionary(inputStr1, inputStr2);//

	}

	/**
	 * 入力された文字列を辞書順で返す
	 *
	 * @param scan 入力された文字列
	 *
	 */
	private static void sortDicionary(String scan1, String scan2) {
		if (scan1.equals(scan2)) {
			System.out.println("2つの文字列は同じです->" + scan1);
			return;
		}

		if (scan1.compareTo(scan2) < 0) {
			System.out.print(scan1 + " ");
			System.out.print(scan2);
		} else if (scan1.compareTo(scan2) > 0) {
			System.out.print(scan2 + " ");
			System.out.println(scan1);
		}

	}
}
