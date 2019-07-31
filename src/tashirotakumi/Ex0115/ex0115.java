package tashirotakumi.Ex0115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex0115 {
	public static void main(String[] args) {
		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr = scan.nextLine();
		scan.close();
		List<String> listStr = cutOutString(inputStr);

		System.out.print("奇数番目：");
		for (int i = 0; i < listStr.size(); i = i + 2) {
			System.out.print("\t" + listStr.get(i));
		}
		System.out.println();
		System.out.print("偶数番目：");
		for (int i = 1; i < listStr.size(); i = i + 2) {
			System.out.print("\t" + listStr.get(i));
		}

	}

	/**
	 * cutOutStringメソッド
	 * 半角スペースで文字列を切り取る
	 * @param input 入力された文字列
	 * @return Listに格納した切り取った文字列
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
				break;
			}
		}
		return listStr;
	}
}