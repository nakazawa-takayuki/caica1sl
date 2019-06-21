package tashirotakumi.Ex0240;

import java.util.Scanner;

//import java.text.DecimalFormat;
public class Ex0240 {

	public static void main(String[] args) {
		int value[][] = new int[9][9];
		int input = 0;
		boolean flag = false;
		//DecimalFormat df1 = new DecimalFormat("00");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				value[i - 1][j - 1] = i * j;
			}
		}
		System.out.println("input number");
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine();
		try {
			input = Integer.parseInt(scan);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (value[i][j] == input) {
					System.out.println("九九の表（" + (i + 1) + "×" + (j + 1) + "）にあります");
					flag = true;
				}
			}
		}
		if (!flag) {
			System.err.println("九九の表にありません");
		}
	}
}
