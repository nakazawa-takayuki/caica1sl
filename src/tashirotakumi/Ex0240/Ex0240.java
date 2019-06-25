package tashirotakumi.Ex0240;

import java.util.Scanner;

//import java.text.DecimalFormat;
public class Ex0240 {
	private static final int MIN_VALUE = 10;
	private static final int MAX_VALUE = 99;

	public static void main(String[] args) {

		int inputNumber = 0;
		boolean existenceTableFlag = false;

		Scanner scan = new Scanner(System.in); //キーボードからの入力
		System.out.println("input number:");
		String inputStr = scan.nextLine();
		scan.close();

		try {
			inputNumber = Integer.parseInt(inputStr);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		if (inputNumber < MIN_VALUE || inputNumber > MAX_VALUE) {
			System.err.println("二桁の数字を入力してください");
			return;
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ( i * j == inputNumber) {
					System.out.println("九九の表（" + i + "×" + j + "）にあります");
					existenceTableFlag = true;
				}
			}
		}
		if (!existenceTableFlag) {
			System.err.println("九九の表にありません");
		}
	}
}
