package tashirotakumi.Ex0241;

import java.util.Scanner;

public class Ex0241 {
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
		int j1;
		for (int i = 0; i < num; i++) {
			for (j1=0; j1 <= i; j1++) {
				System.out.print("*");
			}
			for (int j2 =j1; j2 < num; j2++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	/**
	 * createLeftTriangleメソッド
	 * 入力された数値分、表示を減らしながら表示を行う
	 * @param num 数値
	 */
	public static void createLeftTriangle(int num) {
		int j1 =0;
		for (int i = 0; i < Math.abs(num); i++) {

			for (j1 = 0; j1 < (Math.abs(num) - i); j1++) {
				System.out.print("*");
			}
			for (int j2 =j1; j2 < Math.abs(num); j2++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
