
package 田畑陽一朗.Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから2 つの整数値とコマンドを入力し、計算結果を出力する。
 * コマンドの意味は以下の通りとする。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0140 {

	final static String sum = "0";
	final static String subtraction = "1";
	final static String multiplication = "2";

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Scanner scn2 = new Scanner(System.in);

		int line1 = 0;
		int line2 = 0;

		try {
			System.out.println("input number1:");
			line1 = scn.nextInt();
			System.out.println("input number2:");
			line2 = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。" + e);
		} catch (NullPointerException e) {
			System.out.println("値が入っていません。");
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
	 * @return
	 */
	private static int calcResult(int line1, int line2, String line3) {
		int result = 0;
		if (line3.equals(sum)) {
			result = line1 + line2;
		} else if (line3.equals(subtraction)) {
			result = line1 - line2;
		} else if (line3.equals(multiplication)) {
			result = line1 * line2;
		} else {
			result = line1 / line2;
		}
		return result;
	}
}
