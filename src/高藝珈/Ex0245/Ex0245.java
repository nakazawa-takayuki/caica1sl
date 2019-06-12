package 高藝珈.Ex0245;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから2つの整数値を入力し、最大公約数を出力する。
 *
 * @author 高藝珈
 */

public class Ex0245 {

	public static void main(String[] args) {

		int input1;
		int input2;

		while (true) {
			Scanner input = new Scanner(System.in);

			try {
				System.out.println("input number1：");
				input1 = input.nextInt();
				System.out.println("input number2：");
				input2 = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}

			while (input2 != 0) {
				int r = input1 % input2;
				input1 = input2;
				input2 = r;
			}
			System.out.println("最大公約数= " + input1);
			input.close();
			break;
		}

	}
}
