package tashirotakumi.Ex0160;

import java.util.Scanner;

public class Ex0160 {
	public static void main(String[] args) {
		char value[][] = { { '吉', '吉', '凶', '凶', '凶', '吉' },
				{ '吉', '吉', '凶', '凶', '凶', '吉' },
				{ '凶', '凶', '吉', '吉', '吉', '吉' },
				{ '凶', '吉', '吉', '吉', '凶', '凶' },
				{ '凶', '凶', '凶', '吉', '吉', '凶' },
				{ '凶', '吉', '吉', '凶', '凶', '凶' } };

		System.out.println("1 つ目の数字（0～5）：");
		@SuppressWarnings("resource")
		String input1str = new Scanner(System.in).nextLine();
		System.out.println("2 つ目の数字（0～5）");
		@SuppressWarnings("resource")
		String input2str = new Scanner(System.in).nextLine();

		int input1 = Integer.parseInt(input1str);
		int input2 = Integer.parseInt(input2str);
		System.out.println("占いの結果は" + value[input1][input2] + "です。");

	}

}
