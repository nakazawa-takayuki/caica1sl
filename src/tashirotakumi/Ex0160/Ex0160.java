package tashirotakumi.Ex0160;

import java.util.Scanner;

public class Ex0160 {
	public static final char fortuneValue[][] = { { '吉', '吉', '凶', '凶', '凶', '吉' },
			{ '吉', '吉', '凶', '凶', '凶', '吉' },
			{ '凶', '凶', '吉', '吉', '吉', '吉' },
			{ '凶', '吉', '吉', '吉', '凶', '凶' },
			{ '凶', '凶', '凶', '吉', '吉', '凶' },
			{ '凶', '吉', '吉', '凶', '凶', '凶' } };
	/*

	public class Ex0350 {
		public static void main(String[] args) {
			int [][] node = {
					{ 0, 4, 5, 0, 2, 0 ,0},
					{ 4, 0, 6, 4, 3, 0 ,0},
					{ 5, 6, 0, 6, 0, 0 ,10},
					{ 0, 4, 6, 0, 6, 2 ,6},
					{ 2, 3, 0, 6, 0, 9 ,0},
					{ 0, 0, 0, 2, 9, 0 ,3},
					{ 0, 0, 10, 6, 0, 3 ,0},};
			
		}
	}*/
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
