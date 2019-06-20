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
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}
			if (height < 0) {
				System.out.println(" 0より大きな数字を入力してください");
				continue;
			}

			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < height - i - 1; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			input.close();
			break;
		}
	}
}
