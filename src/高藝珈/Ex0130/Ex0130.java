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

		double inputNumbers[] = { input1, input2, input3 };
		//最大値
		outputMax(inputNumbers);
		//中央値
		outputMedian(inputNumbers);
		//平均値
		outputMean(inputNumbers);
	}

	/**
	 * 最大値
	 * @param numbers [input1, input2, input3]
	 *
	 */
	public static void outputMax(double[] inputNumbers) {
		double outputMax = 0;
		for (int i = 0; i < inputNumbers.length; i++)
			outputMax = Math.max(outputMax, inputNumbers[i]);
		System.out.println("最大値=" + String.format("%.2f", outputMax));
	}

	/**
	 * 中央値
	 *
	 * @param numbers
	 *
	 */
	public static void outputMedian(double[] inputNumbers) {
		int outputMedian = inputNumbers.length / 2;
		if (inputNumbers.length % 2 == 1) {
			System.out.println("中央値=" + String.format("%.2f", inputNumbers[outputMedian]));
		} else {
			System.out.println("中央値=" + String.format("%.2f", (inputNumbers[outputMedian]) / 2.0 + 1));
		}
	}

	/**
	* 平均値
	*
	* @param numbers
	*
	*/
	public static void outputMean(double[] inputNumbers) {
		double sum = 0;
		for (int i = 0; i < inputNumbers.length; i++) {
			sum += inputNumbers[i];
		}
		System.out.println("平均値=" + String.format("%.2f", sum / inputNumbers.length));
	}
}
