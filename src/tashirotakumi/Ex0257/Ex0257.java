package tashirotakumi.Ex0257;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex0257 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("input date1:");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input1 = scan.nextLine();
		System.out.println("input date2:");
		String input2 = scan.nextLine();
		scan.close();
		Date dateTo = null;
		Date dateFrom = null;
		try {
			dateFrom = sdf.parse(input1);
			dateTo = sdf.parse(input2);
		} catch (ParseException e) {
			System.err.println("YYYY/MM/DDの形で入力してください");
			return;
		}
		long dateTimeTo = dateTo.getTime();
		long dateTimeFrom = dateFrom.getTime();

		long dayDiff = (dateTimeTo - dateTimeFrom) / (1000);

		System.out.print("日数の差は" + dayDiff / 86400 + "日で");
		System.out.println(dayDiff + "秒です");
	}
}
