package 高藝珈.Ex0116;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2つの整数値i1、i2を入力する。
 * i1が偶数であり、かつi2が偶数の場合、「2つの値ともに偶数です」と表示する。
 * i1が奇数であり、かつi2が偶数の場合、「i1は奇数です。i2は偶数です」と表示する。
 * i1が偶数であり、かつi2が奇数の場合、「i1は偶数です。i2は奇数です」と表示する。
 * i1が奇数であり、かつi2が奇数の場合、「2つの値ともに奇数です」と表示する。
 *
 * @author 高藝珈
 */

public class Ex0116 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;

		try {

			System.out.println("input number1：");
			input1 = input.nextInt();
			System.out.println("input number2：");
			input2 = input.nextInt();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		if (input1 % 2 == 0 && input2 % 2 == 0) {
			System.out.println("２つの値ともに偶数です");
		} else if (input1 % 2 != 0 && input2 % 2 == 0) {
			System.out.println("i1は奇数です。i2は偶数です");
		} else if (input1 % 2 == 0 && input2 % 2 != 0) {
			System.out.println("i1は奇数です。i2は偶数です");
		} else {
			System.out.println("２つの値ともに奇数です");
		}
	}
}
