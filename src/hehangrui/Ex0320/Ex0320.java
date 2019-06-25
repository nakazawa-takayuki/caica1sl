package hehangrui.Ex0320;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから入力した整数値ｎの階乗を計算して出力する.
 *
 * @author Adrian
 */
public class Ex0320 {

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int inputNum = 0;

		try {
			System.out.println("input number：");
			inputNum = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//結果出力
		if (inputNum <= 20 && inputNum >= 0) {
			System.out.println(inputNum + "の階乗は" + factorial(inputNum) + "です");
		} else {
			System.out.println("計算可能な範囲を超えました。");
		}

	}

	/**
	 * 階乗を計算するメソッド
	 * @param inputNum
	 * @return
	 */
	public static long factorial(long inputNum) {
		if (inputNum == 0) {
			return 1;
		} else {
			return inputNum * factorial(inputNum - 1);
		}

	}

}
