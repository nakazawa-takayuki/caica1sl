package hehangrui.Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから2 つの整数値とコマンドを入力し、計算結果を出力する.
 * コマンドの意味は以下の通りとする.
 * 0 ：足し算
 * 1 ：引き算
 * 2 ：掛け算
 * その他：割り算
 *
 * @author Adrian
 */

public class Ex0140 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		double inputNum[] = new double[2];
		int commandNum;

		try {
			System.out.println("input number1：");
			inputNum[0] = scan.nextInt();

			System.out.println("input number2：");
			inputNum[1] = scan.nextInt();

			System.out.println("input command：");
			commandNum = scan.nextInt();
			scan.close();

			//結果を出力
			if(commandNum >=0 && commandNum <= 2) {
			System.out.println("計算結果 = " + calculation(inputNum, commandNum));
			}else if(inputNum[1] == 0) {
				System.out.println("除数は0だといけません。");
			}else {
				System.out.println("計算結果 = " + String.format("%.2f", calculation(inputNum, commandNum)));
			}

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}
	}

	//コマンドにより計算
	private static double calculation(double[] inputNum, int commandNum) {
		double result = 0;
		switch (commandNum) {
		case 0:
			result = inputNum[0] + inputNum[1];
			break;
		case 1:
			result = inputNum[0] - inputNum[1];
			break;
		case 2:
			result = inputNum[0] * inputNum[1];
			break;
		default:
			result = inputNum[0] / inputNum[1];
		}
		return result;
	}
}
