package 田畑陽一朗.Ex0241;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 整数値を入力し、その行数分の実行例のように直角三角形を出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0241 {

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
			makeRightAngleTriangle(inputNum);
		} else {
			makeInverseTriangle(inputNum);
		}
	}

	//直角三角形を出力するためのメソッド
	public static void makeRightAngleTriangle(int inputNum) {
		int count = 1;
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			count++;
			System.out.println("");
		}
	}

	//負の値が入力されたときに逆三角形にする
	public static void makeInverseTriangle(int inputNum) {
		int count = 0;
		int absoluteValueNum = Math.abs(inputNum);
		for (int i = 0; i < absoluteValueNum; i++) {
			for (int j = 0; j < absoluteValueNum - count; j++) {
				System.out.print("*");
			}
			count++;
			System.out.println("");
		}
	}
}
