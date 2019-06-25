package 高藝珈.Ex0320;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから入力した整数値ｎの階乗を計算して出力する。
 * 繰り返し文でもプログラムは作成できるが、今回は再帰呼び出しで作成すること。
 *
 * @author 高藝珈
 */

public class Ex0320 {

	/**
	 * メインメソッド。
	 * @param args 引数
	 */
	public static void main(String[] args) {

		int input1;

		while (true) { // 入力チェック
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("input number：");
				input1 = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}

			if (input1 < 0) {
				System.out.println("0より大きな数字を入力してください");
				continue;
			}
			input.close();
			break;
		}
		long value = Ex0320.factorial(input1);
		System.out.println(input1 + "の階乗は " + value);
	}

	/**
	 * 指定した数の階乗を求めます。
	 * @param number 数
	 * @return 階乗の値
	 */
	private static long factorial(int number) {
		if (number == 0) {
			return 1L;
		} else {
			return number * Ex0320.factorial(number - 1);
		}
	}
}
