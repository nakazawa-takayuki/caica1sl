package 田畑陽一朗.Ex0242;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 整数値を入力し、その行数分の実行例のように直角三角形を出力する。
 *
 * @author 田畑 陽一朗
 *
 */

public class Ex0242 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int inputNum = 0;

		System.out.println("input number :");
		try {
			inputNum = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
			return;
		} finally {
			scn.close();
		}
		if (inputNum > 0) {
			makeEqualSidesTriangle(inputNum);
		} else if (inputNum < 0) {
			makeEqualSidesInverseTriangle(inputNum);
		} else {
			System.out.println("値を入力してください");
		}
	}

	//二等辺三角形出力するためのメソッド
	public static void makeEqualSidesTriangle(int inputNum) {
		int count = 1;
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum - count; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < count * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			count++;
		}
	}

	//負の値を入力した場合、逆三角形にする
	public static void makeEqualSidesInverseTriangle(int inputNum) {
		int count = 0;
		int absoluteValueNum = Math.abs(inputNum);
		for (int i = 0; i < absoluteValueNum; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (absoluteValueNum - count) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			count++;
		}
	}
}
