package 高藝珈.Ex0200;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから1つの整数値nを入力し、1からnまでの和を求め、結果を出力する。
 *
 * @author 高藝珈
 */

public class Ex0200 {

	public static void main(String[] args) {

		int input1;

		while (true) {
			Scanner input = new Scanner(System.in);

			try {
				System.out.println("input number:");
				input1 = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("数字以外あるいは出力範囲を超える数値が入力されています");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}

			int result = 0;
			if (input1 == 0) {
				System.out.println("合計値 = 0");
			} else if (input1 > 0) {
				result = (1 + input1) * input1 / 2;
				System.out.println("合計値 = " + result);
			} else {
				result = (1 + input1) * (2 - input1) / 2;
				System.out.println("合計値 = " + result);
			}

			input.close();
			break;
		}
	}

}
