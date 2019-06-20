package 高藝珈.Ex0240;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2桁の数字を入力すると、九九の表に値があるかどうか出力する。
 *
 * @author 高藝珈
 */

public class Ex0240 {

	public static void main(String[] args) {

		int input1;

		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("input number：");
				input1 = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}
			if (input1 < 10 || input1 > 81) {
				System.out.println("2桁の数字を入力してください");
				continue;
			}

			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (input1 == i * j) {
						System.out.println("九九の表(" + i + "*" + j + ")にあります");
						input.close();
						return;
					}
				}
			}
			System.out.println("九九の表にありません");
		}
	}
}
