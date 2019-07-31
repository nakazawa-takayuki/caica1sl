package tashirotakumi.Ex0215;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex0215 {
	public static final int defaultNumber = 10;

	public static void main(String[] args) {
		String pairNumberStr = "";
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		System.out.println("input number:");
		String inputStr = scan.nextLine();
		scan.close();
		List<String> listCalculationResult = cutOutString(inputStr);
		pairNumberStr = defaultNumberSameNumberStoring(listCalculationResult);
		//最後の区切り文字削除
		if (pairNumberStr.length() != 1) {
			if (pairNumberStr.length() != 0) {
				System.out.println(
						pairNumberStr.substring(0, pairNumberStr.length() - 1) + "は足して " + defaultNumber + " となるペアです");
			} else {
				System.out.println("ペアになる組み合わせは存在しません");
			}
		}
	}

	/**
	 * defaultNumberSameNumberStoringメソッド
	 * 入力された数値から指定の値と同じになる値のペアを探し文字に格納
	 * @param listCalculationResult 入力された数値
	 * @return ペアになった数値のをまとめた文字列
	 */
	public static String defaultNumberSameNumberStoring(List<String> listCalculationResult) {
		StringBuilder pairNumericStoringBuilder = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < listCalculationResult.size(); i++) {
			for (int j = i + 1; j < listCalculationResult.size(); j++) {
				try {
					sum = Integer.parseInt(listCalculationResult.get(i))
							+ Integer.parseInt(listCalculationResult.get(j));
				} catch (NumberFormatException e) {
					System.out.println("数字を入力してください");
					pairNumericStoringBuilder.append(" ");
					return pairNumericStoringBuilder.toString();
				}
				if (sum == defaultNumber) {
					pairNumericStoringBuilder.append(listCalculationResult.get(i) + "と" + listCalculationResult.get(j) + "、");
				}
			}
		}
		return pairNumericStoringBuilder.toString();
	}

	/**
	 * checkNumberHalfSizeメソッド
	 * 入力された文字列に全角数字が入力されている場合に半角に変更する
	 * @param input 入力された文字列
	 * @return 全角数字を半角に変換後の文字列
	 */
	public static List<String> cutOutString(String inputStr) {
		String placementString;
		List<String> listStr = new ArrayList<>();
		while (inputStr.length() != 0) {
			if (inputStr.indexOf(" ") == 0) {
				inputStr = inputStr.substring(1, inputStr.length());
			} else if (inputStr.indexOf(" ") != -1) {
				placementString = inputStr.substring(0, inputStr.indexOf(" "));
				inputStr = inputStr.substring(inputStr.indexOf(" "), inputStr.length());
				listStr.add(placementString);
			} else {
				placementString = inputStr;
				listStr.add(placementString);
				return listStr;
			}
		}
		return listStr;
	}
}
