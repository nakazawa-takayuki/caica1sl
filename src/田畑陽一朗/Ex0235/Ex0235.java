package 田畑陽一朗.Ex0235;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * キーボードから入力された0～255の範囲の10進数整数値を2進数と16進数に変換して出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0235 {

	static int inputNum = 0;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int inputNum = 0;

		try {
			System.out.println("0～255の範囲の10進数:");
			inputNum = scn.nextInt();
			if (inputNum < 0 && inputNum > 255) {
				System.out.println("0～255の整数値を入力してください");
			}
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
			return;
		} finally {
			scn.close();
		}

		changeBinaryNumber(inputNum);
		changeHexNumber(inputNum);
	}

	//2進数に変換するメソッド
	public static void changeBinaryNumber(int inputNum) {
		String binaryNumber = "";
		do {
			if (inputNum % 2 == 0) {
				binaryNumber = "0" + binaryNumber;
			} else {
				binaryNumber = "1" + binaryNumber;
			}
			inputNum = inputNum / 2;
		} while (0 < inputNum);
		System.out.println("2進数の変換結果: " + binaryNumber);
	}

	//16進数に変換するメソッド
	public static void changeHexNumber(int inputNum) {
		final String hex = Integer.toHexString(inputNum);
		System.out.println("16進数の変換結果: " + hex);
	}
}
