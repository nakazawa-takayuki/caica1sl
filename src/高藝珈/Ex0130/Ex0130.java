package 高藝珈.Ex0130;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*入力された数字の最大値、平均値、中央値を求めます
*
* @author 高藝珈
*/

public class Ex0130 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;

		try {
			System.out.println("input number1：");
			input1 = input.nextInt();
			System.out.println("input number2：");
			input2 = input.nextInt();
			System.out.println("input number3：");
			input3 = input.nextInt();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		String val1 = input1 + "";
		String val2 = input2 + "";
		String val3 = input3 + "";
		if ("".equals(val1) || "".equals(val2) || "".equals(val3)) {
			System.out.println("入力されていません");
		}

		double inputNumbers[] = { input1, input2, input3 };
		//最大値
		max(inputNumbers);
		//中央値
		median(inputNumbers);
		//平均値
		mean(inputNumbers);
	}

	/**
	 * 最大値を返します
	 * @param numbers [input1, input2, input3]
	 * @return max
	 */
	public static void max(double[] inputNumbers) {
		double max = 0;
		for (int i = 0; i < inputNumbers.length; i++)
			max = Math.max(max, inputNumbers[i]);
		System.out.println("最大値=" + String.format("%.2f", max));
	}

	/**
	 * 中央値を返します
	 *
	 * @param numbers
	 * @return median
	 */
	public static void median(double[] inputNumbers) {
		int middle = inputNumbers.length / 2;
		if (inputNumbers.length % 2 == 1) {
			System.out.println("中央値=" + String.format("%.2f", inputNumbers[middle]));
		} else {
			System.out.println("中央値=" + String.format("%.2f", (inputNumbers[middle]) / 2.0 + 1));
		}
	}

	/**
	* 平均値を返します
	*
	* @param numbers
	* @return mean
	*/
	public static void mean(double[] inputNumbers) {
		double sum = 0;
		for (int i = 0; i < inputNumbers.length; i++) {
			sum += inputNumbers[i];
		}
		System.out.println("平均値=" + String.format("%.2f", sum / inputNumbers.length));
	}
}
