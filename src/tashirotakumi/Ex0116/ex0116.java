package tashirotakumi.Ex0116;

import java.util.Scanner;

public class ex0116 {
	public static void main(String[] args) {
		System.out.println("input number1");
		@SuppressWarnings("resource")
		String input1str = new Scanner(System.in).nextLine();
		System.out.println("input number2");
		@SuppressWarnings("resource")
		String input2str = new Scanner(System.in).nextLine();

		int input1 = Integer.parseInt(input1str);
		int input2 = Integer.parseInt(input2str);

		boolean inputcheck1 = oddEven(input1);
		boolean inputcheck2 = oddEven(input2);
		judge(inputcheck1, inputcheck2, input1, input2);

	}

	public static boolean oddEven(int num) {
		boolean check = false;
		num = num % 2;
		if (num == 1) {
			check = true;
		}
		return check;

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
