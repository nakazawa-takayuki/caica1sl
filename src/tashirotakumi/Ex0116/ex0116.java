package tashirotakumi.Ex0116;

import java.util.Scanner;

public class ex0116 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //キーボードからの入力
		System.out.println("input number1");
		String inputStr1 = scan.nextLine();
		System.out.println("input number2");
		String inputStr2 = scan.nextLine();
		scan.close();

		int inputNum1 = 0;
		int inputNum2 = 0;
		try {
			inputNum1 = Integer.parseInt(inputStr1);
			inputNum2 = Integer.parseInt(inputStr2);

		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}

		boolean inputcheck1 = checkOdd(inputNum1);
		boolean inputcheck2 = checkOdd(inputNum2);
		outPutResult(inputcheck1, inputcheck2, inputNum1, inputNum2);

	}

	/**
	 * checkOddメソッド
	 * 決められた値より値が大きいか判断する。
	 * @param num 入力された数値
	 * @return 処理結果に応じた結果
	 */
	public static boolean checkOdd(int num) {
		boolean isOdd = false;
		num = num % 2;
		if (num == 1) {
			isOdd = true;
		}
		return isOdd;

	}

	/**
	 *
	 * @param inputCheck1
	 * @param inputCheck2
	 * @param inputNum1
	 * @param inputNum2
	 */
	public static void outPutResult(boolean inputCheck1, boolean inputCheck2, int inputNum1, int inputNum2) {
		if (inputCheck1) {
			if (inputCheck2) {
				System.out.println("2 つの値ともに奇数です");
			} else {
				System.out.print(inputNum1 + "は奇数です。");
				System.out.print(inputNum2 + "は偶数です。");
			}
		} else {
			if (inputCheck2) {
				System.out.print(inputNum1 + "は偶数です。");
				System.out.print(inputNum2 + "は奇数です。");
			} else {
				System.out.println("2 つの値ともに偶数です");
			}

		}
	}
}
