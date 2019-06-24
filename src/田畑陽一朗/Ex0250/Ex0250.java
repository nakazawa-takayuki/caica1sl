package 田畑陽一朗.Ex0250;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 100以下の素数を要素に持つ配列の中から二分探索を使用して行う。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0250 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int inputNum = 0;

		System.out.println("input number :");

		try {
			inputNum = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数値を入力してください。");
			return;
		} finally {
			scn.close();
		}
		if (inputNum < 10 || inputNum > 99) {
			System.out.println("2桁の整数値を入力してください");
			return;
		}

		ArrayList<Integer> primeList = new ArrayList<Integer>();
		makeList(primeList);
		binarySearchPrime(primeList, inputNum);
	}

	//0から100までの素数をリストに格納する。

	public static void makeList(ArrayList<Integer> primeList) {
		primeList.add(2);

		for (int i = 3; i <= 100; i += 2) {
			int decision = 0;
			for (int j = 2; j <= (i / 2) + 1; j++) {
				if (i % j == 0) {
					decision = 1;
					break;
				}
			}
			if (decision == 0) {
				primeList.add(i);
			}
		}
	}

	//二分探索でリストの中に打ち込んだ値があるか判定

	public static void binarySearchPrime(ArrayList<Integer> primeList, int inputNum) {

		int decision = -1;
		int lower = 0; // リストの下限
		int upper = primeList.size() - 1; // リストの上限

		while (lower <= upper) {
			int mid = (lower + upper) / 2;
			int middle = primeList.get(mid);
			if (middle == inputNum) {
				decision = mid;
				break;
			} else if (middle < inputNum) {
				lower = mid + 1;
			} else {
				upper = mid - 1;
			}
		}
		if (decision < 0) {
			System.out.println("素数ではありません");
		} else {
			System.out.println("素数です");
		}
	}
}
