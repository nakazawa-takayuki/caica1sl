package hehangrui.Ex0235;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから入力された0～255の範囲の10進数整数値を2進数と16進数に変換して出力する.
 *
 * @author Adrian
 */
public class Ex0235 {

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int inputNum = 0;

		try {
			System.out.println("0～255の範囲の10進数：");
			inputNum = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//0～255の範囲の10進数整数値を2進数と16進数に変換した結果を出力する。
		if (inputNum >= 0 && inputNum <= 255) {
			System.out.println("2進数の変換結果：" + String.format("%08d", Integer.parseInt(binaryNum(inputNum))));
			System.out.println("10進数の変換結果：" + HexNum(inputNum));
		} else {
			System.out.println("範囲内の数値を入力してください。");
		}
	}

	/**
	 * 入力値を２進数に変換するメソッド
	 * @param inputNum
	 * @return
	 */
	public static String binaryNum(int inputNum) {
		String bin = Integer.toBinaryString(inputNum);
		return bin;
	}

	/**
	 * 入力値を１６進数に変換するメソッド
	 * @param inputNum
	 * @return
	 */
	public static String HexNum(int inputNum) {
		String hex = Integer.toHexString(inputNum);
		return hex;

	}

}
