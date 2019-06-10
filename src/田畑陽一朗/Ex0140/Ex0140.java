
package 田畑陽一朗.Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから2 つの整数値とコマンドを入力し、計算結果を出力する。
 * コマンドの意味は以下の通りとする。
 * 0:足し算  1:引き算  2:掛け算  その他:割り算
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0140 {

	final static String add = "0";
	final static String sub = "1";
	final static String mul = "2";

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);

		double line1 = 0;
		double line2 = 0;

		try {
			System.out.println("input number1:");
			line1 = scn.nextInt();
			System.out.println("input number2:");
			line2 = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。" );
		}
		System.out.println("input number3:");
		String line3 = scn2.nextLine();
		scn.close();
		scn2.close();

		System.out.print("計算結果 = " + calcResult(line1, line2, line3));
	}

	/**
	 *
	 *打ち込んだコマンドによって、計算を行う。
	 *
	 * @param line1 入力値1
	 * @param line2 入力値2
	 * @param line3 コマンド
	 * @return 計算結果
	 */
	private static double calcResult(double line1, double line2, String line3) {
		double result = 0;
		if (line3.equals(add)) {
			result = line1 + line2;
		} else if (line3.equals(sub)) {
			result = line1 - line2;
		} else if (line3.equals(mul)) {
			result = line1 * line2;
		} else {
			result = line1 / line2;
		}
		return result;
	}
}
