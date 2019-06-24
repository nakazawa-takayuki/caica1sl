package hehangrui.Ex0250;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから2桁の数値を入力し、その数値が 100以下の素数か判断し出力する.
 * 数値が素数か否かの判断は、100以下の素数を要素に持つ配列の中から二分探索を使用して行う.
 *
 * @author Adrian
 */
public class Ex0250 {

	//素数の配列を設定する
	final static int[] PRIME_NUMBER_ARRAY = {
			2, 3, 5, 7, 11, 13, 17, 19,
			23, 29, 31, 37, 41, 43, 47,
			53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	};

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

		//入力値は2桁でない場合の判断
		if (inputNum < 10 || inputNum >= 100) {
			System.out.println("2桁の数値を入力してください。");
			return;
		}

		//結果出力
		if (binarySearch(inputNum)) {
			System.out.println("素数です。");
		} else {
			System.out.println("素数ではありません。");
		}

	}

	//二分探索で入力値は配列に存在するかを判断するメソッド
	public static boolean binarySearch(int inputNum) {
		int low = 0;
		int high = PRIME_NUMBER_ARRAY.length;
		boolean result = false;

		while (low < high) {
			int middle = (low + high) / 2;
			if (inputNum < PRIME_NUMBER_ARRAY[middle]) {
				high = middle;
			} else if (inputNum > PRIME_NUMBER_ARRAY[middle]) {
				low = middle + 1;
			} else {
				return result = true;
			}
		}
		return result;

	}

}
