package 高藝珈.Ex0241;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 整数値を入力し、その行数分の実行例のように直角三角形を出力する。
 *
 * @author 高藝珈
 */

public class Ex0241 {

	public static void main(String[] args) {

		int height;

		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("input number：");
				height = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}
			if (height == 0) {
				System.out.println(" 0以外の数字を入力してください");
				continue;
			}
			input.close();
			break;
		}

		if (height > 0) {
			makeTriangle1(height);
		} else {
			makeTriangle2(height);
		}
	}

	private static void makeTriangle1(int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < height - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void makeTriangle2(int height) {
		for (int i = 0; i <= -height; i++) {
			for (int j = 1; j <= -height + 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
