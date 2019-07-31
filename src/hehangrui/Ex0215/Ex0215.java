package hehangrui.Ex0215;

import java.util.Scanner;

/**
 * 問題
 * キーボードから複数の数字を入力し、足して10になる 2つの数値をペアとして出力する.
 *
 * @author Adrian
 */
public class Ex0215 {

	final static int SUM_VALUE = 10;

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		System.out.println("input number：");
		String inputNums = scan.nextLine();
		scan.close();

		String[] inputArrays = inputNums.split(" ");
		int[] inputNumArrays = new int[inputArrays.length];

		try {
			for (int i = 0; i < inputArrays.length; i++) {
				inputNumArrays[i] = Integer.parseInt(inputArrays[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("数値以外が入力されました。");
		}

		if (inputNumArrays.length <= 1) {
			System.out.println("二つ数字以上を入力してください。");
		}

		boolean isSum = false;
		for (int i = 0; i < inputNumArrays.length - 1; i++) {
			for (int j = i + 1; j < inputNumArrays.length; j++) {
				if (inputNumArrays[i] + inputNumArrays[j] == SUM_VALUE) {
					System.out.print(inputNumArrays[i] + "と" + inputNumArrays[j] + "、");
					isSum = true;
				}
			}
		}
		if (isSum) {
			System.out.println("は足して" + SUM_VALUE + "となるペアです。");
		} else {
			System.out.println("ペアとなる数字はありません。");
		}
	}
}
