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
	final static int[] PRIME_NUMBER = {
			2, 3, 5, 7, 11, 13, 17, 19,
			23, 29, 31, 37, 41, 43, 47,
			53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	};

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("input number：");
			int inputNum = scan.nextInt();
			scan.close();

			//入力値は2桁でない場合の判断
			if (inputNum < 10 || inputNum >= 100) {
				System.out.println("2桁の数値を入力してください。");
				return;
			}

			//メソッドに引数を渡す
			int position = binarySearch(PRIME_NUMBER, inputNum, PRIME_NUMBER.length - 1, 0);

			//結果出力
			if (position == -1) {
				System.out.println("素数ではありません。");
			} else {
				System.out.println("素数です。");
			}

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

	}

	public static int binarySearch(int[] array, int inputNum, int high, int low) {

		//入力値は配列の範囲を超えるかを判断する
		if (inputNum < array[low] || inputNum > array[high] || low > high) {
			return -1;
		}

		//二分探索で入力値は配列に存在するかを判断する
		int middle = (low + high) / 2;
		if (inputNum < array[middle]) {
			return binarySearch(array, inputNum, middle - 1, low);
		} else if (inputNum > array[middle]) {
			return binarySearch(array, inputNum, high, middle + 1);
		} else {
			return middle;
		}

	}

}
