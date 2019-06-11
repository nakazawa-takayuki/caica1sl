package 高藝珈.Ex0235;

import java.util.InputMismatchException;

/**
 * キーボードから入力された0～255の範囲の10進数整数値を2進数と16進数に変換して出力する。
 *
 * @author 高藝珈
 */

import java.util.Scanner;

public class Ex0235 {

	public static void main(String[] args) {

		int input1;

		while (true) {
			Scanner input = new Scanner(System.in);

			try {
				System.out.println("0～255の範囲の10進数：");
				input1 = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}

			if (input1 < 0 || input1 > 255) {
				System.out.println(" 0～255の範囲の10進数を入力してください");
				continue;
			}

			String bin = Integer.toBinaryString(input1);
			System.out.println("2進数の変換結果：" + bin);

			String hex = Integer.toHexString(input1);
			System.out.println("16進数の変換結果：" + hex);
			input.close();
			break;
		}
	}

}
