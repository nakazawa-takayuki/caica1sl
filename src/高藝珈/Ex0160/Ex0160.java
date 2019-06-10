package 高藝珈.Ex0160;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 高藝珈
 * @return
 */

public class Ex0160 {

	//二次元配列に占いの結果を入れます
	final static String[][] RESULT_TABLE = { { "吉", "吉", "凶", "凶", "凶", "吉" },
			{ "吉", "吉", "凶", "吉", "凶", "吉" },
			{ "凶", "凶", "吉", "吉", "吉", "吉" },
			{ "凶", "吉", "吉", "吉", "凶", "凶" },
			{ "凶", "凶", "凶", "吉", "吉", "凶" },
			{ "凶", "吉", "吉", "凶", "凶", "凶" } };

	public static void main(String[] args) throws Exception {

		int input1;
		int input2;

		while (true) {
			Scanner input = new Scanner(System.in);

			try {
				System.out.println("1つ目の数字（ 0~5) :");
				input1 = input.nextInt();
				System.out.println("2つ目の数字（ 0~5) :");
				input2 = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}

			if (input1 > 5 || input2 > 5 || input1 < 0 || input2 < 0) {
				System.out.println(" 0~5を入力してください");
				continue;
			}

			System.out.println("占いの結果は" + RESULT_TABLE[input1][input2] + "です");
			input.close();
			break;
		}
	}
}
