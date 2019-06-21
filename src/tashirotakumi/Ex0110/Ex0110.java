package tashirotakumi.Ex0110;

import java.util.Scanner;

public class Ex0110 {
	public static void main(String[] args) {
		System.out.println("文字列1：");
		String scan1 = new Scanner(System.in).nextLine(); //キーボードからの入力
		System.out.println("文字列2：");
		String scan2 = new Scanner(System.in).nextLine(); //キーボードからの入力
		Comparison(scan1, scan2);//

	}

	/**
	 * 入力された文字列を辞書順で返す
	 *
	 * @param scan 入力された文字列
	 *
	 */
	private static void Comparison(String scan1, String scan2) {
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
