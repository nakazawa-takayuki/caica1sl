package 高藝珈.Ex0210;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 九九の表を出力する。
 *
 * @author 高藝珈
 */

public class Ex0210 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;

		try {
			System.out.println("input number9：");
			input1 = input.nextInt();
			System.out.println("input number9：");
			input2 = input.nextInt();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		for (int i = 1; i <= input2; i++) {
			for (int j = 1; j <= input1; j++) {
				if (i * j < 10) {
					System.out.print("0" + i * j + " ");
				} else {
					System.out.print(i * j + " ");
				}
			}
			System.out.println("");
		}
	}
}
