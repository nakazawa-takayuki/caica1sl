package 高藝珈.Ex0242;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 整数値を入力し、その行数分の実行例のように二等辺三角形を出力する。
 *
 * @author 高藝珈
 */

public class Ex0242 {

	public static void main(String[] args) {

		int row;

		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("input number：");
				row = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}

			if (row == 0) {
				System.out.println(" 0以外の数字を入力してください");
				continue;
			}
			input.close();
			break;
		}

		if (row > 0) {
			makeTriangle1(row);
		} else {
			makeTriangle2(row);
		}
	}

	private static int makeTriangle1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.printf(" ");
			}

			for (int s = 1; s <= 2 * i - 1; s++) {
				System.out.printf("*");
			}
			System.out.println();

		}
		return row;
	}

	private static int makeTriangle2(int row) {
		int i, j;
		for (i = -row; i >= 1; i--) {
			for (j = 1; j <= -row - i; j++) {
				System.out.print(" ");
			}

			for (j = i * 2 - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return row;
	}
}