package tashirotakumi.Ex0117;

import java.util.Scanner;

public class ex0117 {
	public static void main(String[] args) {
		System.out.println("input english score");
		@SuppressWarnings("resource")
		String input1str = new Scanner(System.in).nextLine();
		System.out.println("input math score");
		@SuppressWarnings("resource")
		String input2str = new Scanner(System.in).nextLine();

		int input1 = Integer.parseInt(input1str);
		int input2 = Integer.parseInt(input2str);

		boolean inputcheck1 = determine(input1);
		boolean inputcheck2 = determine(input2);
		judge(inputcheck1, inputcheck2);

	}

	public static boolean determine(int num) {
		boolean check = false;
		if (num >= 80) {
			check = true;
		}
		return check;

	}

	public static void judge(boolean inputcheck1, boolean inputcheck2) {
		if (inputcheck1) {
			if (inputcheck2) {
				System.out.println("進級");
			} else {
				System.out.print("再試験");
			}
		} else {
			if (inputcheck2) {
				System.out.print("再試験");
			} else {
				System.out.println("留年");
			}

		}
	}
}
