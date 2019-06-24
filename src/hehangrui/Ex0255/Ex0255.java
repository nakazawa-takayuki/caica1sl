package hehangrui.Ex0255;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * キーボードから「月の始まりの曜日の番号」と「月末の日の数字」を入力し、カレンダーを出力する.
 *
 * @author Adrian
 */
public class Ex0255 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int dayOfTheWeek = 0;
		int monthEnd = 0;

		try {
			System.out.println("月の始まりの曜日を数字で入力してください：");
			dayOfTheWeek = scan.nextInt();

			System.out.println("月末の日を数字で入力してください：");
			monthEnd = scan.nextInt();
			scan.close();

		//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//曜日は0～6の数字以外を入力した時の判断
		if (dayOfTheWeek < 0 || dayOfTheWeek > 6) {
			System.out.println("曜日は0～6の数字を入力してください。");
			return;
		}

		//月末日は28～31の数字以外を入力した時の判断
		if (monthEnd < 28 || monthEnd > 31) {
			System.out.println("月末日は28～31の数字を入力してください。");
			return;
		}

		//カレンダーを出力する
		System.out.println("日 " + "月 " + "火 " + "水 " + "木 " + "金 " + "土");
		System.out.println("--------------------");
		creatCalendar(dayOfTheWeek, monthEnd);
		System.out.println("--------------------");

	}

	//入力された曜日の番号と月末の日によってカレンダーを作るメソッド
	public static void creatCalendar(int dayOfTheWeek, int monthEnd) {
		int day = 0;
		for (int rowWeek = 0; rowWeek < 6; rowWeek++) {
			for (int colWeek = 0; colWeek < 7; colWeek++) {
				if (colWeek < dayOfTheWeek && rowWeek == 0) {
					System.out.print("   ");
				} else if (day < monthEnd) {
					System.out.print(String.format("%02d", (day + 1)) + " ");
					day++;
				}
			}
			System.out.println();
		}

	}

}
