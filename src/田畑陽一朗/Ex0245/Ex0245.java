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

	public static void main(String[] args) {

		int inputNum1 = 0;
		int inputNum2 = 0;
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("input number1:");
			inputNum1 = scn.nextInt();
			System.out.println("input number2:");
			inputNum2 = scn.nextInt();
			scn.close();
		} catch (InputMismatchException e) {
			System.out.println("整数値を入力してください。");
			return;
		}
		checkCommoNumber(inputNum1, inputNum2);
	}

	public static void checkCommoNumber(int inputNum1, int inputNum2) {
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

		while ((remainder = bigInputNum % smallInputNum) != 0) {
			bigInputNum = smallInputNum;
			smallInputNum = remainder;
		}
		System.out.println(smallInputNum);
	}
}
