package 田畑陽一朗.Ex0257;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * キーボードから日付を2つ入力し、大きい日付から小さい日付の差を秒で出力する。
 * 日付形式は「YYYYMMDD」とする。日付が等しい場合はゼロを出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0257 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("input date1");
		String inputDate1 = scn.nextLine();
		System.out.println("input date2");
		String inputDate2 = scn.nextLine();
		scn.close();

		if (inputDate1.contains(":") || inputDate2.contains(":")) {
			System.out.println("指定した形式ではありません");
			return;
		}

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		compareInputDateSize(inputDate1, inputDate2, simpleDateFormat1, simpleDateFormat2);

		long dateArray[] = compareInputDateSize(inputDate1, inputDate2, simpleDateFormat1, simpleDateFormat2);

		calcInputDate(dateArray);
	}

	public static long[] compareInputDateSize(String inputDate1, String inputDate2, SimpleDateFormat simpleDateFormat1,
			SimpleDateFormat simpleDateFormat2) {

		long[] dateArray = new long[2];
		Date dateFormat1 = null;
		Date dateFormat2 = null;
		try {
			simpleDateFormat1.setLenient(false);
			dateFormat1 = simpleDateFormat1.parse(inputDate1);
			simpleDateFormat2.setLenient(false);
			dateFormat2 = simpleDateFormat2.parse(inputDate2);
		} catch (ParseException e) {
			System.out.println("指定した形式ではありません");
			System.exit(0);
		}

		long dateTime1 = dateFormat1.getTime();
		long dateTime2 = dateFormat2.getTime();
		long bigDateTime;
		long smallDateTime;
		if (dateTime1 > dateTime2) {
			bigDateTime = dateTime1;
			smallDateTime = dateTime2;
		} else {
			bigDateTime = dateTime2;
			smallDateTime = dateTime1;
		}
		dateArray[0] = bigDateTime;
		dateArray[1] = smallDateTime;
		return dateArray;
	}

	public static void calcInputDate(long dateArray[]) {
		long bigDateTime = dateArray[0];
		long smallDateTime = dateArray[1];

		long daysDifference = (bigDateTime - smallDateTime) / (1000 * 60 * 60 * 24);

		long minutesDifference = (bigDateTime - smallDateTime) / (1000);

		if (bigDateTime == smallDateTime) {
			System.out.println("日数の差は" + daysDifference + "日です");
		} else {
			System.out.println("日数の差は" + daysDifference + "で" + minutesDifference + "秒です");
		}
	}
}
