package 田畑陽一朗.Ex0160;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * キーボードから入力された0～5の範囲の2つの数字を元に、占いの結果を出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0160 {

	final static String[][] FORTUNE_ARRAY = {
			{ "吉", "吉", "凶", "凶", "凶", "吉" },
			{ "吉", "吉", "凶", "吉", "凶", "吉" },
			{ "凶", "凶", "吉", "吉", "吉", "吉" },
			{ "凶", "吉", "吉", "吉", "凶", "凶" },
			{ "凶", "凶", "凶", "吉", "吉", "凶" },
			{ "凶", "吉", "吉", "凶", "凶", "凶" }
	};

	public static void main(String[] args) {

		int line1 = 0;
		int line2 = 0;
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("1つ目の数字(0～5) :");
			line1 = scn.nextInt();
			System.out.println("2つ目の数字(0～5) :");
			line2 = scn.nextInt();
			scn.close();
		} catch (InputMismatchException e) {
			System.out.println("0～5の整数を入力してください。");
			return;
		}
		try {
			System.out.println("占いの結果は" + FORTUNE_ARRAY[line1][line2] + "です");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0～5の数字を入力してください。");
		}
	}
}
