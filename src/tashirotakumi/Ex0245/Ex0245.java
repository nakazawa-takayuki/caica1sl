package tashirotakumi.Ex0245;

import java.util.Scanner;

public class Ex0245 {
	public static void main(String[] args) {
		int num1, num2, divisor = 0;
		System.out.println("input number1:");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input1 = scan.nextLine();
		num1 = convertStringToInt(input1);
		System.out.println("input number2:");
		String input2 = scan.nextLine();
		scan.close();
		num2 = convertStringToInt(input2);
		divisor = euclideanAlgorithm(num1, num2);
		System.out.println("最大公約数 =" + divisor);

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
			System.exit(0);
		}
		return num;
	}

	/**
	 * euclideanAlgorithmメソッド
	 * 最大公約数を求める
	 * @param num1一つ目の入力された値
	 * @param num2二つ目の入力された値
	 * @return 最大公約数
	 */
	public static int euclideanAlgorithm(int num1, int num2) {
		if (num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		int divisor = num1 % num2;
		while (divisor != 0) {
			num1 = num2;
			num2 = divisor;
			divisor = num1 % num2;
		}

		return num2;
	}

}
