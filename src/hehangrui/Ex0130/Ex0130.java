package hehangrui.Ex0130;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *キーボードから3つの整数値を入力し、最大値、中央値、平均値小数第3位を四捨五入を出力する。
 */

public class Ex0130 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int num[] = new int[3];
		int max;

		try {
			System.out.println("input number1：");
			num[0] = scan.nextInt();

			System.out.println("input number2：");
			num[1] = scan.nextInt();

			System.out.println("input number3：");
			num[2] = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//最大値を出力
		max = num[0];
		if (max < num[1]) {
			max = num[1];
		} else if (max < num[2]) {
			max = num[2];
		}
		System.out.print("最大値 = " + max);

		//中央値を出力
		int median = median(num);
		System.out.print("  中央値 = " + median);

		//平均値を出力
		double averageValue = averageValue(num);
		System.out.print("  平均値 = " + String.format("%.2f", averageValue));
	}

	//中央値を抽出
	public static int median(int[] num) {
		Arrays.sort(num);
		int middle = num.length / 2;
		if (num.length % 2 == 1) {
			return num[middle];
		} else {
			return (num[middle - 1] + num[middle]) / 2;
		}
	}

	//平均値を計算
	public static double averageValue(int[] num) {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
}
