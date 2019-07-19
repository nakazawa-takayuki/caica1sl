package tashirotakumi.ExAd079A;

import java.util.Scanner;

public class ExAd079A {
	public static final int N_MIN = 1000;
	public static final int N_MAX = 9999;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[] inputChar;
		String inputStr = scan.nextLine();
		inputChar = inputStr.toCharArray();
		inputNumCheck(inputStr, N_MAX, N_MIN);
		scan.close();

		int sumeFlag = 0;
		for (int i = 0; i < inputChar.length - 1; i++) {
			if (inputChar[i] == inputChar[i + 1]) {
				sumeFlag++;

			} else {
				sumeFlag = 0;
			}
			if (sumeFlag == 2) {
				System.out.println("YES");
				break;
			}

		}
	}

	public static void inputNumCheck(String inputNumber, int upperLimit, int lowerLimit) {
		int number = 0;
		try {
			number = Integer.parseInt(inputNumber);
		} catch (NumberFormatException e) {
			System.err.println("入力エラー");
			System.exit(0);
		}
		if (number >= lowerLimit && number <= upperLimit) {

			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}
}
