package hehangrui.Ex0116;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *2つの整数値i1、i2を入力する。
 *i1が偶数であり、かつi2 が偶数の場合、「2つの値ともに偶数です」と表示する。
 *i1が奇数であり、かつi2 が偶数の場合、「i1は奇数です。i2 は偶数です」と表示する。
 *i1が偶数であり、かつi2 が奇数の場合、「i1は偶数です。i2は奇数です」と表示する。
 *i1が奇数であり、かつi2 が奇数の場合、「2つの値ともに奇数です」と表示する。
 */

public class Ex0116 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int i1 = 0;
		int i2 = 0;

		try {
			System.out.println("input number1：");
			i1 = scan.nextInt();

			System.out.println("input number2：");
			i2 = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//奇数か偶数か判定
		if (i1 % 2 == 0 && i2 % 2 == 0) {
			System.out.println("2 つの値ともに偶数です");
		} else if (i1 % 2 != 0 && i2 % 2 == 0) {
			System.out.println("i1 は奇数です。 i2 は偶数です");
		} else if (i1 % 2 == 0 && i2 % 2 != 0) {
			System.out.println("i1 は偶数です。 i2 は奇数です");
		} else {
			System.out.println("2 つの値ともに奇数です");
		}
	}
}
