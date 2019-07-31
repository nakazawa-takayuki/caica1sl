package tashirotakumi.Ex0200;

import java.util.Scanner;

public class Ex0200 {
	public static void main(String[] args) {
		int input = 0;
		int sumOutput;
		System.out.println("input number");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		try {
			input = Integer.parseInt(scan.nextLine());
			scan.close();
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		sumOutput = designatedValueAddition(input);
		System.out.println("合計値＝" + sumOutput);

	}

	/**
	 * designatedValueAdditionメソッド
	 * 入力された値から1までを順に足していく。
	 * @param input 入力された値
	 * @return 和の結果を返す
	 */
	public static int designatedValueAddition(int input) {
		int output = 0;
		for (int i = 1; Math.abs(input) >= i; i++) {
			output = output + i;
		}
		if (input < 0) {
			output = output * -1;
		}
		return output;
	}
}
