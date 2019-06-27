package tashirotakumi.Ex0250;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex0250 {
	private static final int PRIME_RANGE_MIN_INT = 1;
	private static final int PRIME_RANGE_MAX_INT = 100;
	private static final int THRESHORD_MIN_INT = 10;
	private static final int THRESHORD_MAX_INT = 100;

	public static void main(String[] args) {

		System.out.println("input number:");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		scan.close();
		int input = convertStringToInt(inputStr);
		List<Integer> listPrime = primePlace();
		int primeResult = binarySearch(input, listPrime);
		showResult(primeResult);
	}

	public static int convertStringToInt(String input) {
		int num = 0;
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			System.exit(0);
		}
		if (num < THRESHORD_MIN_INT || num >= THRESHORD_MAX_INT) {
			System.err.println("二桁の数字を入力してください");
			System.exit(0);
		}
		return num;
	}

	public static List<Integer> primePlace() {
		List<Integer> ListPrime = new ArrayList<Integer>();
		ListPrime.add(1);
		for (int i = PRIME_RANGE_MIN_INT; i < PRIME_RANGE_MAX_INT; i++) {
			int divisibleCount = 0;
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					divisibleCount = divisibleCount + 1;
				}
			}
			if (divisibleCount == 2) {
				ListPrime.add(i);
			}
		}
		return ListPrime;
	}

	public static int binarySearch(int inputValue, List<Integer> listPrime) {
		int listSize = listPrime.size();
		int left = 0;
		int right = listSize - 1;
		int center = 0;

		while (right >= left) {
			center = (left + right) / 2;
			if (inputValue == listPrime.get(center)) {
				return center;
			}
			if (inputValue > listPrime.get(center)) {
				left = center + 1;
			} else {
				right = center - 1;
			}
		}

		return -1;
	}

	public static void showResult(int primeResult) {
		if (primeResult != -1) {
			System.out.println("素数です");
		} else {
			System.out.println("素数ではありません");
		}
	}
}
