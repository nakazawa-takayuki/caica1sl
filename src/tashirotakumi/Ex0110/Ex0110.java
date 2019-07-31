package tashirotakumi.Ex0110;

import java.util.Scanner;

public class Ex0110 {
	public static void main(String[] args) {
		System.out.println("文字列1：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr1 = scan.nextLine(); //キーボードからの入力
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
	private static void sortDicionary(String inputStr1, String inputStr2) {
		if (inputStr1.equals(inputStr2)) {
			System.out.println("2つの文字列は同じです->" + inputStr1);
			return;
		}

		if (inputStr1.compareTo(inputStr2) < 0) {
			System.out.print(inputStr1 + " ");
			System.out.print(inputStr2);
		} else if (inputStr1.compareTo(inputStr2) > 0) {
			System.out.print(inputStr2 + " ");
			System.out.println(inputStr1);
		}

	}
}
