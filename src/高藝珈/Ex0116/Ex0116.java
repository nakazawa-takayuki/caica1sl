package 高藝珈.Ex0116;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
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
