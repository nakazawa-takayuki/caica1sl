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
		try {
			System.out.println("input number :");
			inputNum = scn.nextInt();
			if (inputNum < 0) {
				System.out.println("正の値を入力してください");
				return;
			}
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
			return;
		} finally {
			scn.close();
		}
		makeRightAngleTriangle(inputNum);
	}

	//直角三角形を出力するためのメソッド
	public static void makeRightAngleTriangle(int inputNum) {
		int count = 1;
		for (int j = 0; j < inputNum; j++) {
			for (int i = 0; i < count; i++) {
				System.out.print("*");
			}
			count++;
			System.out.println("");
		}
	}
}
