package hehangrui.Ex0240;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * 2桁の数字を入力すると、九九の表に値があるかどうか出力する.
 *
 * @author Adrian
 */
public class Ex0240 {

	//九九表の定数配列を設定する
	final static int[][] NINETY_NINE_TABLE = {
			{ 1,  2,  3,  4,  5,  6,  7,  8,  9 },
			{ 2,  4,  6,  8, 10, 12, 14, 16, 18 },
			{ 3,  6,  9, 12, 15, 18, 21, 24, 27 },
			{ 4,  8, 12, 16, 20, 24, 28, 32, 36 },
			{ 5, 10, 15, 20, 25, 30, 35, 40, 45 },
			{ 6, 12, 18, 24, 30, 36, 42, 48, 54 },
			{ 7, 14, 21, 28, 35, 42, 49, 56, 63 },
			{ 8, 16, 24, 32, 40, 48, 56, 64, 72 },
			{ 9, 18, 27, 36, 45, 54, 63, 72, 81 }
	};

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int inputNum = 0;

		try {
			System.out.println("input number :");
			inputNum = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("整数以外が入力されました。");
			return;
		}

		//入力値は2桁でない場合の判断
		if (inputNum < 10 || inputNum >= 100) {
			System.out.println("2桁の数値を入力してください。");
			return;
		}
		//処理メソッドを呼び出す
		checkNum(inputNum);
	}

	/**
	 * 数値は九九表にあるかを判断し、出力する
	 * @param inputNum
	 * @return
	 */
	public static int checkNum(int inputNum) {
		boolean isNiceNum = true;
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				if (NINETY_NINE_TABLE[i][j] == inputNum) {
					int multiplierA = i + 1;
					int multiplierB = j + 1;
					System.out.println("九九の表（" + multiplierA + "*" + multiplierB + "）にあります");
					isNiceNum = false;
				}
			}
		}

		//数値は九九表にない場合の判断
		if (isNiceNum) {
			System.out.println("九九の表にありません");
		}
		return inputNum;
	}
}
