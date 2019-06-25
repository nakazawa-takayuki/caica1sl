package tashirotakumi.Ex0160;

import java.util.Scanner;

public class Ex0160 {
	public static final char fortuneValue[][] = { { '吉', '吉', '凶', '凶', '凶', '吉' },
			{ '吉', '吉', '凶', '凶', '凶', '吉' },
			{ '凶', '凶', '吉', '吉', '吉', '吉' },
			{ '凶', '吉', '吉', '吉', '凶', '凶' },
			{ '凶', '凶', '凶', '吉', '吉', '凶' },
			{ '凶', '吉', '吉', '凶', '凶', '凶' } };

	public static void main(String[] args) {

		int input1 = 0;
		int input2 = 0;
		System.out.println("1 つ目の数字（0～5）：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr1 = scan.nextLine();
		System.out.println("2 つ目の数字（0～5）");
		String inputStr2 = scan.nextLine();
		scan.close();
		try {
			input1 = Integer.parseInt(inputStr1);
			input2 = Integer.parseInt(inputStr2);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}

		System.out.println("占いの結果は" + fortuneValue[input1][input2] + "です。");

	}

}
