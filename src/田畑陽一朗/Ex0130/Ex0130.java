package 田畑陽一朗.Ex0130;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから3つの整数値を入力し、最大値、中央値、平均値小数第3位を四捨五入を出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0130 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int maximum = 0;
		int median = 0;
		int average = 0;

		try {
			System.out.println("input number1:");
			maximum = scn.nextInt();
			System.out.println("input number2:");
			median = scn.nextInt();
			System.out.println("input number3:");
			average = scn.nextInt();
			scn.close();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。" + e);
			return;
		} catch (NullPointerException e) {
			System.out.println("値が入っていません。");
			return;
		}

		ArrayList<Integer> calcResultList = new ArrayList<Integer>();
		calcResultList.add(maximum);
		calcResultList.add(median);
		calcResultList.add(average);

		//最大値
		System.out.print("最大値 = " + calcMaximum(calcResultList));

		//中央値
		System.out.print("  中央値 = " + calcMedian(calcResultList));

		//平均値
		System.out.print("  平均値 = " + averageResult(calcResultList));
	}

	//最大値
	private static int calcMaximum(ArrayList<Integer> calcResultList) {
		int maximum = 0;
		for (int calcResult : calcResultList) {
			if (maximum < calcResult) {
				maximum = calcResult;
			}
		}
		return maximum;
	}

	//中央値
	private static int calcMedian(ArrayList<Integer> calcResultList) {

		Collections.sort(calcResultList);
		if (calcResultList.size() % 2 == 1) {
			int median1 = calcResultList.get(calcResultList.size() / 2);
			return median1;
		} else {
			// 要素数が偶数だった場合
			int median2 = (calcResultList
					.get(calcResultList.size() / 2 + calcResultList.get(calcResultList.size() / 2 - 1) / 2));
			return median2;
		}
	}

	//平均値
	private static BigDecimal averageResult(ArrayList<Integer> calcResultList) {
		double sum = 0;
		for (int calcResult : calcResultList) {
			sum += calcResult;
		}
		double averageResult = sum / calcResultList.size();
		BigDecimal bdAverage = new BigDecimal(averageResult);
		BigDecimal resultDbAverage = bdAverage.setScale(2, BigDecimal.ROUND_HALF_UP);
		return resultDbAverage;
	}

}