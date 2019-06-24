package 高藝珈.Ex0250;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから2桁の数値を入力し、その数値が100以下の素数か判断し出力する。
 * 数値が素数か否かの判断は、100以下の素数を要素に持つ配列の中から二分探索を使用して行う。
 *
 * @author 高藝珈
 */

public class Ex0250 {

	final static int[] PRIME = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
			89, 97 };

	public static void main(String[] args) {
		int input1;
		Arrays.sort(PRIME);

		while (true) { // 入力チェック
			Scanner input = new Scanner(System.in);
			System.out.println("input number：");
			try {
				input1 = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}
			if (input1 < 10 || input1 > 99) {
				System.out.println("2桁の数字を入力してください");
				continue;
			}
			input.close();
			break;
		}


		if (search(input1)) {
			System.out.println("素数です");
		} else {
			System.out.println("素数ではありません");
		}
	}

	public static boolean search(int input1) {
		int low = 0;
		int high = PRIME.length - 1;
		boolean result = false;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (input1 == PRIME[mid]) {
				return result = true;
			}
			if (input1 > PRIME[mid]) {
				low = mid + 1;
			}
			if (input1 < PRIME[mid]) {
				high = mid - 1;
			}
		}
		return result;
	}
}
