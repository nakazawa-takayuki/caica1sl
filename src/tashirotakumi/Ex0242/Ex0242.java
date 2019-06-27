package tashirotakumi.Ex0242;

import java.util.Scanner;

public class Ex0242 {
	public static void main(String[] args) {

		System.out.println("input number:");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		scan.close();
		int num = convertStringToInt(input);

		if (num < 0) {
			createLeftTriangle(num);
		} else {
			createRightTriangle(num);
		}
	}

	/**convertStringToIntメソッド
	 * inputが数字以外の場合エラーを表示、数字の場合int型に格納
	 * @param input 文字列
	 * @return 数値
	 */
	public static int convertStringToInt(String input) {
		int num = 0;
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
		}
		return num;
	}

	/**
	 * createRightTriangleメソッド
	 * 入力された数値分、表示を増やしながら表示を行う
	 * @param num 数値
	 */
	public static void createRightTriangle(int num) {

		for (int i = 0; i < num; i++) {

			for (int j1 = num - 1; j1 > i; j1--) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 <= i; j2++) {
				System.out.print("*");
			}
			for (int j3 = 1; j3 <= i; j3++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * createRightTriangleメソッド
	 * 入力された数値分、表示を増やしながら表示を行う
	 * @param num 数値
	 */
	public static void createLeftTriangle(int num) {

		int j = 0;
		for (int i = 0; i < Math.abs(num); i++) {
			for (int space = Math.abs(num) - i; space < Math.abs(num); space++) {
				System.out.print(" ");
			}
			for (int asterisk = i + 1; asterisk < Math.abs(num); asterisk++) {
				System.out.print("*");
			}

			for (j = 0; j < (Math.abs(num) - i); j++) {
				System.out.print("*");
			}
			for (int endSpace = j; endSpace < Math.abs(num); endSpace++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
