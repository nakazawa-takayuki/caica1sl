package hehangrui.Ex0160;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから入力された0~5 の範囲の2つの数字を元に、占いの結果を出力する.
 * 占いの結果は以下のルールに従う.
 *
 * @author Adrian
 */

public class Ex0160 {

	//占い結果の参照ルール
	final static String[][] DECISION_TABLE = {
			{ "吉", "吉", "凶", "凶", "凶", "吉" },
			{ "吉", "吉", "凶", "吉", "凶", "吉" },
			{ "凶", "凶", "吉", "吉", "吉", "吉" },
			{ "凶", "吉", "吉", "吉", "凶", "凶" },
			{ "凶", "凶", "凶", "吉", "吉", "凶" },
			{ "凶", "吉", "吉", "凶", "凶", "凶" }
	};

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int inputNum1 = 0;
		int inputNum2 = 0;

		try {
			System.out.println("１つ目の数字（0～5）：");
			inputNum1 = scan.nextInt();

			System.out.println("２つ目の数字（0～5）：");
			inputNum2 = scan.nextInt();
			scan.close();

			//0～5以内の整数しか入力できないと定義し、出力する
			if (inputNum1 >= 0 && inputNum1 <= 5 && inputNum2 >= 0 && inputNum2 <= 5) {
				System.out.println("占いの結果は" + DECISION_TABLE[inputNum1][inputNum2] + "です");
			} else {
				System.out.println("0～5の整数を入力してください。");
			}

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("整数以外が入力されました。");
			return;
		}
	}
}