package tashirotakumi.Ex0130;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex0130 {
	public static void main(String[] args) {

		double input1 = 0;
		double input2 = 0;
		double input3 = 0;

		DecimalFormat format = new DecimalFormat("#.#");
		format.setMinimumFractionDigits(3);
		format.setMaximumFractionDigits(3);

		System.out.println("input number1：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input1str = scan.nextLine();
		System.out.println("input number2：");
		String input2str = scan.nextLine();
		System.out.println("input number3：");
		String input3str = scan.nextLine();
		scan.close();
		try {
			input1 = Double.parseDouble(input1str);
			input2 = Double.parseDouble(input2str);
			input3 = Double.parseDouble(input3str);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		List<Double> listNumber = new ArrayList<>();
		listNumber.add(input1);
		listNumber.add(input2);
		listNumber.add(input3);

		Collections.sort(listNumber);

		double ave = calcAve(listNumber);

		System.out.print("最大値　＝" + listNumber.get(listNumber.size() - 1));
		System.out.print("\t中央値　＝" + listNumber.get(listNumber.size() / 2));
		System.out.println("\t平均値　＝" + format.format(ave));
	}

	/**
	 * calcAveメソッド
	 * 入力された値から平均値を求める
	 * @param listNumber 入力された数値
	 * @return 求められた平均の値
	 */
	public static double calcAve(List<Double> listNumber) {
		double ave = 0;
		for (int i = 0; i < listNumber.size(); i++) {
			ave = ave + listNumber.get(i);
		}
		ave = ave / listNumber.size();
		return ave;

	}
}
