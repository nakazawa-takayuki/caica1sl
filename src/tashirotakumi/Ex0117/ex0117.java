package tashirotakumi.Ex0117;

import java.util.Scanner;

public class ex0117 {
	public static final int passingPoint = 80;

	public static void main(String[] args) {

		int input1 = 0;
		int input2 = 0;
		System.out.println("input english score");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr1 = scan.nextLine();
		System.out.println("input math score");
		String inputStr2 = scan.nextLine();

		scan.close();
		try {
			input1 = Integer.parseInt(inputStr1);
			input2 = Integer.parseInt(inputStr2);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		boolean passingCheck1 = determineIfOrMoreScore(input1);
		boolean passingCheck2 = determineIfOrMoreScore(input2);
		determineWhetherPassing(passingCheck1, passingCheck2);

	}

	/**
	 * determineIfOrMoreScoreメソッド
	 * 入力された数字が定数以上かを判断する。
	 * @param num 入力された数字（点数）
	 * @return 入力された数字が定数以上かでtrue falseを返す
	 */
	public static boolean determineIfOrMoreScore(int num) {
		boolean passingCheck = false;
		if (num >= passingPoint) {
			passingCheck = true;
		}
		return passingCheck;

	}

	/**
	 * determineWhetherPassingメソッド
	 * true falseを受け取りそれに準じた結果を表示する
	 * @param passingCheck1 一つ目の点数の結果
	 * @param passingCheck2 二つ目の点数の結果
	 */
	public static void determineWhetherPassing(boolean passingCheck1, boolean passingCheck2) {
		if (passingCheck1) {
			if (passingCheck2) {
				System.out.println("進級");
			} else {
				System.out.print("再試験");
			}
		} else {
			if (passingCheck2) {
				System.out.print("再試験");
			} else {
				System.out.println("留年");
			}

		}
	}
}
