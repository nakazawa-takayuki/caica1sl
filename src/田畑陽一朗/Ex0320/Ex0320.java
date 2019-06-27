package 田畑陽一朗.Ex0320;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * キーボードから入力した整数値ｎの階乗を計算して出力する。今回は再帰呼び出しで作成する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0320 {

	public static void main(String[] args) {

		int inputNum = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("input number :");
		try {
			inputNum = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
			return;
		} finally {
			scn.close();
		}
		System.out.println(calcFactorial(inputNum));
	}

	//階乗を再帰呼び出しで求める。

	public static int calcFactorial(int inputNum) {
		if (inputNum > 1) {
			int value = inputNum * calcFactorial(inputNum - 1);
			return value;
		} else {
			return 1;
		}
	}
}
