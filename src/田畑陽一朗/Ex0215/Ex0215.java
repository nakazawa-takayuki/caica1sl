package 田畑陽一朗.Ex0215;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * キーボードから複数の数字を入力し、足して10になる2つの数値をペアとして出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0215 {

	final static int TARGET_NUMBER = 10;

	public static void main(String[] args) {

		String line = null;

		Scanner scn = new Scanner(System.in);
		System.out.println("input number :");
		line = scn.nextLine();
		scn.close();

		String[] splitLine = line.split("\\s+");
		int[] imputNumber = new int[splitLine.length];
		for (int i = 0; i < splitLine.length; i++) {
			try {
				imputNumber[i] = Integer.parseInt(splitLine[i]);
			} catch (NumberFormatException e) {
				System.out.println("整数値を入力してください。");
				return;
			}
		}

		List<NumberPair> pairs = calc(imputNumber);
		for (int i = 0; i < pairs.size(); i++) {
			if (i == 0) {
				System.out.print(pairs.get(i));
			} else {
				System.out.print("、");
				System.out.print(pairs.get(i));
			}
		}
		if (splitLine.length < 2) {
			System.out.println("数字を二つ以上入力してください");
		} else if (pairs.isEmpty()) {
			System.out.println("ペアとなる数字はありません。");
		} else {
			System.out.println(" は足して" + TARGET_NUMBER + "となるペアです");
		}
	}

	private static List<NumberPair> calc(int[] numbers) {
		List<NumberPair> result = new ArrayList<NumberPair>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == TARGET_NUMBER) {
					NumberPair pair = new NumberPair(numbers[i], numbers[j]);
					result.add(pair);
				}
			}
		}
		return result;
	}
}