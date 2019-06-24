package tashirotakumi.Ex0116;

import java.util.Scanner;

public class ex0116 {
	public static void main(String[] args) {

		int input1Str = 0;
		int input2Str = 0;

		Scanner scan = new Scanner(System.in); //キーボードからの入力
		System.out.println("input number1");
		String inputStr1 = scan.nextLine();
		System.out.println("input number2");
		String inputStr2 = scan.nextLine();

		scan.close();

		try {
			input1Str = Integer.parseInt(inputStr1);
			input2Str = Integer.parseInt(inputStr2);

		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}

		boolean inputcheck1 = checkOdd(input1Str);
		boolean inputcheck2 = checkOdd(input2Str);
		judge(inputcheck1, inputcheck2, input1Str, input2Str);

	}

	public static boolean checkOdd(int num) {
		boolean isOdd = false;
		num = num % 2;
		if (num == 1) {
			isOdd = true;
		}
		return isOdd;

	}

	public static void judge(boolean inputcheck1, boolean inputcheck2, int input1, int input2) {
		if (inputcheck1) {
			if (inputcheck2) {
				System.out.println("2 つの値ともに奇数です");
			} else {
				System.out.print(input1 + "は奇数です。");
				System.out.print(input2 + "は偶数です。");
			}
		} else {
			if (inputcheck2) {
				System.out.print(input1 + "は偶数です。");
				System.out.print(input2 + "は奇数です。");
			} else {
				System.out.println("2 つの値ともに偶数です");
			}

		}
	}
}
