package 田畑陽一朗.Ex0255;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから「月の始まりの曜日の番号」と「月末の日の数字」を入力し、カレンダーを出力する。
 * 「月の始まりの曜日の番号」は以下の通りとする。
 * 日曜：0 月曜： 1 火曜： 2 水曜： 3 木曜： 4 金曜： 5 土曜： 6
 *
 * @author 田畑 陽一朗
 *
 */

public class Ex0255 {

	final static int WEEKLY_NUMBER = 7;

	public static void main(String[] args) {

		int inputNum1 = 0;
		int inputNum2 = 0;
		Scanner scn = new Scanner(System.in);

		try {
			System.out.println("月の始まりの曜日を入力してください。");
			inputNum1 = scn.nextInt();
			System.out.println("月末の日を数字で入力して下さい:");
			inputNum2 = scn.nextInt();
			scn.close();
		} catch (InputMismatchException e) {
			System.out.println("整数値を入力してください。");
			return;
		}

		if (inputNum1 < 0 || inputNum1 > 6) {
			System.out.println("0～6の数字を入力してください。");
			return;
		}
		if (inputNum2 < 28 || inputNum2 > 31) {
			System.out.println("28～31の数字を入力してください。");
			return;
		}

		System.out.println("日 月 火 水 木 金 土");
		System.out.println("--------------------");

		int[] dateArray = new int[inputNum2];
		for (int i = 1; i <= inputNum2; i++) {
			dateArray[i - 1] = i;
		}

		makeCalender(inputNum1, inputNum2, dateArray);
	}

	public static void makeCalender(int inputNum1, int inputNum2, int[] dateArray) {

		//最初の1行目の表示
		for (int i = 0; i < inputNum1; i++) {
			System.out.print("　 ");
		}
		for (int i = 0; i < WEEKLY_NUMBER - inputNum1; i++) {
			System.out.print(String.format("%02d", dateArray[i]));
			System.out.print(" ");
		}
		System.out.println("");

		//2行目以降の表示
		for (int i = WEEKLY_NUMBER - inputNum1; i < inputNum2;) {
			for (int j = 1; j <= WEEKLY_NUMBER; j++) {
				if (i == inputNum2) {
					break;
				}
				System.out.print(String.format("%02d", dateArray[i]));
				System.out.print(" ");
				i++;
			}
			System.out.println("");
		}
	}
}
