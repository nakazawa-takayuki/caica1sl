package tashirotakumi.Ex0140;

import java.util.Scanner;

public class Ex0140 {

	public static void main(String[] gras) {
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
		int input3 = Integer.parseInt(input3str);

		double kekka = calculation(input1, input2, input3);
		System.out.println(kekka);
	}

	public static double calculation(double input1, double input2, int input3) {
		double input;
		switch (input3) {
		case 0:
			input = input1 + input2;
			break;
		case 1:
			input = input1 - input2;
			break;
		case 2:
			input = input1 * input2;
			break;
		default:
			input = input1 / input2;

		}
		return input;

	}
}
