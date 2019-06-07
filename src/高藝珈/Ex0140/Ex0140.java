package 高藝珈.Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*
* @author 高藝珈
*/

public class Ex0140 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		int inputCommand = 0;

		try {
			System.out.println("input number1：");
			input1 = input.nextInt();
			System.out.println("input number2：");
			input2 = input.nextInt();
			System.out.println("input command：");
			inputCommand = input.nextInt();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		double result = 0;
		switch (inputCommand) {
		case 0:
			result = input1 + input2;
			break;

		case 1:
			result = input1 - input2;
			break;

		case 2:
			result = input1 * input2;
			break;

		default:
			try {
				result = (double) input1 / (double) input2;
				break;
			} catch (ArithmeticException e) {
				System.out.println("0除算エラーです。");
				return;
			}
		}
		System.out.println("結果 =" + result);
	}
}