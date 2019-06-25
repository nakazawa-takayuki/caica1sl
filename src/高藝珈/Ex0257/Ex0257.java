package 高藝珈.Ex0257;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * キーボードから日付を2つ入力し、大きい日付から小さい日付の差を秒で出力する。日付形式は「 Y Y Y Y M M D D 」とする。
 * 日付が等しい場合はゼロを出力する 。
 *
 * @author 高藝珈
 */

public class Ex0257 {

	public static void main(String[] args) {

		String input1 = null;
		String input2 = null;

		while (true) { // 入力チェック

			Scanner input = new Scanner(System.in);

			Ex0257 obj = new Ex0257();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

			try {
				System.out.println("input date1:");
				input1 = input.nextLine();
				System.out.println("input date2:");
				input2 = input.nextLine();

				Date date1 = simpleDateFormat.parse(input1);
				Date date2 = simpleDateFormat.parse(input2);
				obj.printDifference(date1, date2);
			} catch (ParseException e) {
				System.out.println("間違った内容が入力されています");
				continue;
			}
			input.close();
			break;
		}

	}

	public void printDifference(Date startDate, Date endDate) {

		//milliseconds
		long different = endDate.getTime() - startDate.getTime();

		long secondsInMilli = 1000;
		long minutesInMilli = secondsInMilli * 60;
		long hoursInMilli = minutesInMilli * 60;
		long daysInMilli = hoursInMilli * 24;

		long elapsedDays = different / daysInMilli;
		long elapsedSeconds = different / secondsInMilli;

		if (different == 0) {
			System.out.println("日数の差は0です");
		} else if (different > 0) {
			System.out.println(elapsedDays + "日で" + elapsedSeconds + "秒です");
		} else {
			System.out.println(elapsedDays/-1 + "日で" + elapsedSeconds/-1 + "秒です");
		}
	}
}
