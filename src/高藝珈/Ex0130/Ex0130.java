package 高藝珈.Ex0130;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 入力された数字の最大値、平均値、中央値を求めます
 *
 * @author 高藝珈
 */

public class Ex0130 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double input1 = 0;
		double input2 = 0;
		double input3 = 0;

		// 入力フォームを表示します
		try {
			System.out.println("input number1：");
			input1 = input.nextDouble();
			System.out.println("input number2：");
			input2 = input.nextDouble();
			System.out.println("input number3：");
			input3 = input.nextDouble();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		double inputNumbers[] = { input1, input2, input3 };
		//最大値
		double outputMax = outputMax(inputNumbers);
		//中央値
		double outputMedian = outputMedian(inputNumbers);
		//平均値
		double outputMean = outputMean(outputMax, inputNumbers);

		System.out.println("最大値=" + String.format("%.2f", outputMax));
		System.out.println("中央値 = " + String.format("%.2f", outputMedian));
		System.out.println("平均値=" + String.format("%.2f", outputMean));

	}

	/**
	 * 最大値
	 * @param inputNumbers [input1, input2, input3]
	 *
	 */
	private static double outputMax(double[] inputNumbers) {
		double max = 0;
		for (int i = 0; i < inputNumbers.length; i++) {
			if (max < inputNumbers[i]) {
				max = inputNumbers[i];
			}
		}
		return max;
	}

	/**
	 * 中央値
	 *
	 * @param numbers
	 * @return
	 *
	 */

	private static double outputMedian(double[] inputNumbers) {
		Arrays.sort(inputNumbers);
		return inputNumbers[1];

	}

	/**
	* 平均値
	*
	* @param numbers
	*
	*/
	private static double outputMean(double outputMax, double[] numbers) {
		return outputMax / numbers.length;
	}

}
