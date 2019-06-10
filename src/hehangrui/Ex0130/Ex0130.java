package hehangrui.Ex0130;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから3つの整数値を入力し、最大値、中央値、平均値小数第3位を四捨五入を出力する.
 *
 * @author Adrian
 */

public class Ex0130 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		double inputNum[] = new double[3];

		try {
			System.out.println("input number1：");
			inputNum[0] = scan.nextInt();

			System.out.println("input number2：");
			inputNum[1] = scan.nextInt();

			System.out.println("input number3：");
			inputNum[2] = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//最大値を出力
		double maxNum = calcMax(inputNum);
		System.out.print("最大値 = " + maxNum);

		//中央値を出力
		double medianNum = calcMedian(inputNum);
		System.out.print("  中央値 = " + medianNum);

		//平均値を出力
		double averageValue = calcAverage(inputNum);
		System.out.print("  平均値 = " + String.format("%.2f", averageValue));
	}

	//最大値を抽出
	public static double calcMax(double[] inputNum) {
		double max = 0;
		for (int i = 0; i < inputNum.length; i++) {
			max = Math.max(max, inputNum[i]);
		}
		return max;
	}

	//中央値を抽出
	public static double calcMedian(double[] inputNum) {
		Arrays.sort(inputNum);
		int middle = inputNum.length / 2;
		if (inputNum.length % 2 == 1) {
			return inputNum[middle];
		} else {
			return (inputNum[middle - 1] + inputNum[middle]) / 2;
		}
	}

	//平均値を計算
	public static double calcAverage(double[] inputNum) {
		double sum = 0;
		for (int i = 0; i < inputNum.length; i++) {
			sum += inputNum[i];
		}
		return sum / inputNum.length;
	}
}
