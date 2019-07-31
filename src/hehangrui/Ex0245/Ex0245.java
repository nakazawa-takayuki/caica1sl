package hehangrui.Ex0245;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから2つの整数値を入力し、最大公約数を出力する.
 *
 * @author Adrian
 */
public class Ex0245 {

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int inputNum1 = 0;
		int inputNum2 = 0;

		try {
			System.out.println("input number1：");
			inputNum1 = scan.nextInt();

			System.out.println("input number2：");
			inputNum2 = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//結果出力
		if (checkZero(inputNum2)) {
			System.out.println("最大公約数はありません。");
		} else {
			System.out.println("最大公約数 = " + divisor(inputNum1, inputNum2));
		}
	}

	/**
	 * 入力値は0の場合をチェックするメソッド
	 * @param inputNum
	 * @return
	 */
	public static boolean checkZero(int inputNum) {
		if (inputNum == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ユークリッドの互除法を用いて最大公約数を求めるメソッド
	 * @param inputNum1
	 * @param inputNum2
	 * @return
	 */
	public static int divisor(int inputNum1, int inputNum2) {
		int result;
		while ((result = inputNum1 % inputNum2) != 0) {
			inputNum1 = inputNum2;
			inputNum2 = result;
		}
		return inputNum2;
	}
}
