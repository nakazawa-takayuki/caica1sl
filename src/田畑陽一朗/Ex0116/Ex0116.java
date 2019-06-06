package 田畑陽一朗.Ex0116;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * 2つの整数値 i1 、i2 を入力する。
 *i1が偶数であり、かつ i2 が偶数の場合、「 2 つの値ともに偶数です」と表示する。
 *i1が奇数であり、かつ i2 が偶数の場合、「 i1 は奇数です。 i2 は偶数です」と表示する。
 *i1が偶数であり、かつ i2 が奇数の場合、「 i1 は偶数です。 i2 は奇数です」と表示する。
 *i1が奇数であり、かつ i2 が奇数の場合、「 2 つの値ともに奇数です」と表示する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0116 {

	private static Scanner sc1;

	public static void main(String[] args) {

		sc1 = new Scanner(System.in);

		int line1 = 0;
		int line2 = 0;
		try {
			System.out.println("input number1:");
			line1 = sc1.nextInt();
			System.out.println("input number2:");
			line2 = sc1.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("エラーです" + e);
			return;
		} catch (NullPointerException e) {
			System.out.println("値が入っていません。");
		}

		if (line1 % 2 == 0 && line2 % 2 == 0) {
			System.out.println("2 つの値ともに偶数です");
		} else if (line1 % 2 != 0 && line2 % 2 == 0) {
			System.out.println("i1 は奇数です。i2 は偶数です");
		} else if (line1 % 2 == 0 && line2 % 2 != 0) {
			System.out.println("i1は偶数です。i2 は奇数です");
		} else if (line1 % 2 != 0 && line2 % 2 != 0) {
			System.out.println("2つの値ともに奇数です");
		}
	}

}
