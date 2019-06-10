package hehangrui.Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *キーボードから2 つの整数値とコマンドを入力し、計算結果を出力する。
 *コマンドの意味は以下の通りとする。
 *0 ：足し算
 *1 ：引き算
 *2 ：掛け算
 *その他：割り算
 */
public class Ex0140 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int num[] = new int[2];
		int commandNum;

		try {
			System.out.println("input number1：");
			num[0] = scan.nextInt();

			System.out.println("input number2：");
			num[1] = scan.nextInt();

			System.out.println("input command：");
			commandNum = scan.nextInt();
			scan.close();

			//結果を出力
			System.out.println("計算結果 = " + calculation(num, commandNum));

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}
	}

	//コマンドにより計算
	private static int calculation(int[] num, int commandNum) {
		int result = 0;
		switch (commandNum) {
		case 0:
			result = num[0] + num[1];
			break;
		case 1:
			result = num[0] - num[1];
			break;
		case 2:
			result = num[0] * num[1];
			break;
		default:
			result = num[0] / num[1];
		}
		return result;
	}
}
