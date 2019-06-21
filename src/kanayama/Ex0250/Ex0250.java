package kanayama.Ex0250;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 課題Ex0250<br>
 * 入力値が素数であるか判定する。
 */
public class Ex0250 {
	static int[] PRIME_LIST =
		{11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
	public static void main(String[] args){
		int inputNum = 0;

		Scanner inp = new Scanner(System.in);

		while(true) {
			System.out.println("input number：");
			try {
				inputNum = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.print("整数以外が含まれています。");
				inp.next();
				continue;
			}

			if((inputNum < 10)||(100 < inputNum)) {
				System.out.print("10～100の範囲で入力してください");
				continue;
			}

			break;
		}
		inp.close();
		if(checkPrime(inputNum)) {
			System.out.println("素数です");
		}else {
			System.out.println("素数ではありません");
		}
	}

	/**
	 * 二分探索で素数判定する
	 * @return result
	 */
	private static boolean checkPrime(int inputNum) {
		boolean result = false;
		int left = 0;
		int right = PRIME_LIST.length;

		while (left < right) {
			int middle = (left + right) / 2;
			if (PRIME_LIST[middle] == inputNum) {
				result = true;
				break;
			} else if (PRIME_LIST[middle] > inputNum) {
				right = middle;
			} else if (PRIME_LIST[middle] < inputNum) {
				left = middle + 1;
			}
		}
		return result;
	}
}
