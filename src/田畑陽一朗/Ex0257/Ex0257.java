package 田畑陽一朗.Ex0257;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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

	public static final String DATE_FORMAT = "\\d+/[0-9]{2}/[0-9]{2}";

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("input date1");
		String inputDate1 = scn.nextLine();
		System.out.println("input date2");
		String inputDate2 = scn.nextLine();
		scn.close();

		checkInputDate(inputDate1, inputDate2);

		Date dateFormatArray[] = checkInputDate(inputDate1, inputDate2);
		compareInputDateSize(dateFormatArray);

		long dateArray[] = compareInputDateSize(dateFormatArray);
		calcInputDate(dateArray);
	}

	//入力した日付の大小を判別して、long型の配列に格納する

	public static Date[] checkInputDate(String inputDate1, String inputDate2) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

		Date dateFormat1 = null;
		Date dateFormat2 = null;

		//指定した日付の形式か確認する
		if ((inputDate1.matches(DATE_FORMAT)) && (inputDate2.matches(DATE_FORMAT))) {
			try {
				simpleDateFormat.setLenient(false);
				dateFormat1 = simpleDateFormat.parse(inputDate1);
				simpleDateFormat.setLenient(false);
				dateFormat2 = simpleDateFormat.parse(inputDate2);
			} catch (ParseException e) {
				System.out.println("指定した形式ではありません");
				System.exit(0);
			}
		} else {
			System.out.println("指定した形式ではありません");
			System.exit(0);
		}

		Date[] dateFormatArray = new Date[2];
		dateFormatArray[0] = dateFormat1;
		dateFormatArray[1] = dateFormat2;
		return dateFormatArray;
	}

	//long型に変換し、大小比較して配列に格納

	public static long[] compareInputDateSize(Date dateFormatArray[]) {

		long[] dateArray = new long[2];
		long dateTime1 = dateFormatArray[0].getTime();
		long dateTime2 = dateFormatArray[1].getTime();

		dateArray[0] = dateTime1;
		dateArray[1] = dateTime2;
		Arrays.sort(dateArray);
		return dateArray;
	}

	//日付と秒の差分を計算して出力

	public static void calcInputDate(long dateArray[]) {
		long bigDateTime = dateArray[1];
		long smallDateTime = dateArray[0];

		long daysDifference = (bigDateTime - smallDateTime) / (1000 * 60 * 60 * 24);

		long minutesDifference = (bigDateTime - smallDateTime) / (1000);

		if (bigDateTime == smallDateTime) {
			System.out.println("日数の差は" + daysDifference + "日です");
		} else {
			System.out.println("日数の差は" + daysDifference + "で" + minutesDifference + "秒です");
		}
	}
}
