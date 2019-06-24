package tashirotakumi.Ex0241;

import java.util.Scanner;

public class Ex0241 {
	public static void main(String[] args) {

		System.out.println("input number:");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		scan.close();
		int num = number(input);

		display(num);
	}

	/**numberメソッド
	 * inputが数字以外の場合エラーを表示、数字の場合int型に格納
	 * @param input 文字列
	 * @return 数値
	 */
	public static int number(String input) {
		int num = 0;
		try {
			num = Integer.parseInt(input);
		}catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
		}
		return num;
	}
	/**
	 * displayメソッド
	 * 入力された数値分、表示を増やしながら表示を行う
	 * @param num 数値
	 */
	public static void display(int num) {

		for(int i=0;i<num;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("-");
		}

	}
}
