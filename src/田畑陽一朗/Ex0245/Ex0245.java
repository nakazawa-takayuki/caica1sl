package 田畑陽一朗.Ex0245;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * キーボードから2つの整数値を入力し、最大公約数を出力する。
 * @author 田畑 陽一朗
 *
 */
public class Ex0245 {

	final static String MAX_COMMON_NUMBER = "最大公約数 = ";

	public static void main(String[] args) {

		int inputNum1 = 0;
		int inputNum2 = 0;
		Scanner scn = new Scanner(System.in);

		try {
			System.out.println("input number1:");
			inputNum1 = scn.nextInt();
			System.out.println("input number2:");
			inputNum2 = scn.nextInt();
			scn.close();
		} catch (InputMismatchException e) {
			System.out.println("整数値を入力してください。");
			return;
		}
		checkCommonNumber(inputNum1, inputNum2);
	}

	public static void checkCommonNumber(int inputNum1, int inputNum2) {
		int bigInputNum = 0;
		int smallInputNum = 0;
		int remainder = 0;

		if (inputNum1 > inputNum2) {
			bigInputNum = inputNum1;
			smallInputNum = inputNum2;
		} else {
			bigInputNum = inputNum2;
			smallInputNum = inputNum1;
		}
		try {
			if (bigInputNum == 0 && smallInputNum == 0) {
				System.out.println("上限がありません");
			} else if (bigInputNum == 0 ^ smallInputNum == 0) {
				System.out.println(MAX_COMMON_NUMBER + bigInputNum);
			}
		} catch (ArithmeticException e) {
			System.out.println("整数値を入力してください。");
			return;
		}

		while ((remainder = bigInputNum % smallInputNum) != 0) {
			bigInputNum = smallInputNum;
			smallInputNum = remainder;
		}
		System.out.println(MAX_COMMON_NUMBER + smallInputNum);
	}
}
