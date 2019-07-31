package tashirotakumi.ExAd084A;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExAd084A {
	public static final int MAX_INT= 24;
	public static final int MIN_INT= 0;
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh");
		try {
		inputNumCheck(args[0],MAX_INT,MIN_INT);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("１から24で入力してください");
			System.exit(0);
		}
		String input1 = "";

			input1 = "2019/12/30/" + args[0];

		String input2 = "2020/01/01/00";

		Date dateTo = null;
		Date dateFrom = null;
		try {
			dateFrom = sdf.parse(input1);
			dateTo = sdf.parse(input2);
		} catch (ParseException e) {
			System.err.println("１から24で入力してください");
			return;
		}
		long dateTimeTo = dateTo.getTime();
		long dateTimeFrom = dateFrom.getTime();

		long dayDiff = (dateTimeTo - dateTimeFrom) / (1000);

		System.out.print(dayDiff / 3600);
	}
	public static void inputNumCheck(String Number, int upperLimit, int lowerLimit) {
		int inputint=0;
		try {
			inputint=Integer.parseInt(Number);
		}catch (NumberFormatException e) {
			System.exit(0);
		}

		if (inputint >= lowerLimit && inputint <= upperLimit) {

			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}
}