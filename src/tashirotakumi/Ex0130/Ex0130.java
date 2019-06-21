package tashirotakumi.Ex0130;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex0130 {
	public static void main(String[] args) {

		DecimalFormat format = new DecimalFormat("#.#");
		format.setMinimumFractionDigits(3);
		format.setMaximumFractionDigits(3);

		System.out.println("input number1：");
		@SuppressWarnings("resource")
		String input1str = new Scanner(System.in).nextLine();
		System.out.println("input number2：");
		@SuppressWarnings("resource")
		String input2str = new Scanner(System.in).nextLine();
		System.out.println("input number3：");
		@SuppressWarnings("resource")
		String input3str = new Scanner(System.in).nextLine();

		double input1 = Double.parseDouble(input1str);
		double input2 = Double.parseDouble(input2str);
		double input3 = Double.parseDouble(input3str);

		double ave;

		List<Double> list = new ArrayList<>();
		list.add(input1);
		list.add(input2);
		list.add(input3);

		Collections.sort(list);

		ave = judge(input1, input2, input3);
		System.out.print("最大値　＝" + list.get(2));
		System.out.print("\t中央値　＝" + list.get(1));
		System.out.println("\t平均値　＝" + format.format(ave));
	}

	/*
		public static double comparison1(double num1, double num2) {
			double check;
			if (num1 >= num2) {
				check = num1;
			} else {
				check = num2;
			}
			return check;
		}

		public static double comparison2(double num1, double num2) {
			double check;
			if (num1 <= num2) {
				check = num1;
			} else {
				check = num2;
			}
			return check;
		}
		*/
	public static double judge(double input1, double input2, double input3) {
		double ave = (input1 + input2 + input3) / 3;
		return ave;

	}
}
