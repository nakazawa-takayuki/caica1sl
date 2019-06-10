package hehangrui.Ex0200;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから1つの整数値nを入力し、1からnまでの和を求め、結果を出力する.
 *
 * @author Adrian
 */
public class Ex0200 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int inputNum;

		try {
			System.out.println("input number1：");
			inputNum = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//整数1からnまでの和を求め、結果を出力
		int result = 0;
		if (inputNum == 0) {
			System.out.println("合計値 = 0");
		} else if (inputNum > 0) {
			result = (1 + inputNum) * inputNum / 2;
			System.out.println("合計値 = " + result);
		} else {
			result = (1 + inputNum) * (2 - inputNum) / 2;
			System.out.println("合計値 = " + result);
		}
	}
}
