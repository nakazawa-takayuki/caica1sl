package tashirotakumi.Ex0200;

import java.util.Scanner;

public class Ex0200 {
	public static void main(String[] args) {
		int input = 0;
		int output;
		System.out.println("input number");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		try {
			input = Integer.parseInt(scan.nextLine());
			scan.close();
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		output = sum(input);
		System.out.println("合計値＝" + output);

	}

	public static int sum(int input) {
		int output = 0;
		for (int i = 1; input >= i; i++) {
			output = output + i;
		}
		return output;
	}
}
