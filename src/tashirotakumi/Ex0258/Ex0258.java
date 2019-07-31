package tashirotakumi.Ex0258;

import java.util.Scanner;

public class Ex0258 {

	public static void main(String[] args) {
		System.out.println("input date1:");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String factorialStr = scan.nextLine();
		scan.close();
		long value = 0;
		int factorialNumber = convertStringToInt(factorialStr);
		for (int i = 1; i <= factorialNumber; i++) {

			value = Ex0258.factorial(i);
		}
		System.out.println(factorialNumber + "の階乗は" + value + "です");
	}

	public static int convertStringToInt(String input) {
		int num = 0;
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			System.exit(0);
		}
		return num;
	}

	private static long factorial(int number) {

		if (number == 1) {
			return 1L;

		} else {
			return number * Ex0258.factorial(number - 1);
		}
	}

}
