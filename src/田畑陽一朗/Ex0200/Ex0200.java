package 田畑陽一朗.Ex0200;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * キーボードから1つの整数値nを入力し、1からnまでの和を求め、結果を出力する。
 *
 * @author 田畑 陽一朗
 *
 */

public class Ex0200 {

	static int line1 = 0;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		try {
			System.out.println("input number :");
			line1 = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
		}
		scn.close();

		int value = 0;
		System.out.println("合計値 = " + totalValue(value));
	}

	private static int totalValue(int value) {
		int sum = 0;
		for (int i = 1; i <= line1; i++) {
			sum += i;
		}
		return sum;
	}
}
