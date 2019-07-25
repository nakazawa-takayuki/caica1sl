package tashirotakumi.ExAd096A;

import java.util.ArrayList;
import java.util.List;

public class ExAd096A {
	public static void main(String[] args) {
		//String[] word = args[0].split("\\s+");
		/*
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr1 = scan.nextLine();
		System.out.println("  ");
		String inputStr2 = scan.nextLine();
		scan.close();
		*/
		int month = 0;
		try {
			month = inputCheck(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("正しい値を入力してください");
		}
		if (month < 1 || month > 12) {
			System.exit(0);
		}
		int date = 0;
		try {
			date = inputCheck(args[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("正しい値を入力してください");

		}
		if (date < 1 || date > 31) {
			System.exit(0);
		}
		List<String> listCalculationResult = new ArrayList<>();
		listCalculationResult = takahasi(month, date);
		ListVew(listCalculationResult);
	}

	public static List<String> takahasi(int input, int input2) {
		List<String> listCalculationResult = new ArrayList<>();
		for (int i = 1; i <= input; i++) {
			if (input == i) {
				for (int j = 1; j <= input2; j++) {
					if (i == j) {
						listCalculationResult.add(i + "月" + j + "日");
					}
				}
			} else {
				for (int j = 1; j <= 31; j++) {
					if (i == j) {
						listCalculationResult.add(i + "月" + j + "日");
					}
				}
			}
		}
		return listCalculationResult;

	}

	public static void ListVew(List<String> listCalculationResult) {
		if (listCalculationResult.size() == 1) {
			System.out.print(listCalculationResult.get(0) + "のみが「高橋」です。");
		} else {
			for (int i = 0; i < listCalculationResult.size(); i++) {
				if (i == listCalculationResult.size() - 1) {
					System.out.print(listCalculationResult.get(i) + "。");
				} else {
					System.out.print(listCalculationResult.get(i) + "、");
				}

			}
			System.out.println("合計" + listCalculationResult.size() + "日が「高橋」です。");
		}
	}

	public static int inputCheck(String inputStr) {
		int temporary = 0;
		try {
			temporary = Integer.parseInt(inputStr);
		} catch (NumberFormatException e) {
			System.out.println("正しい値を入力してください");
		}
		return temporary;

	}

}
