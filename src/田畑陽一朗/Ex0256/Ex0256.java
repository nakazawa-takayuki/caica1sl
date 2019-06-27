package 田畑陽一朗.Ex0256;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex0256 {

	public static final String DATE_FORMAT = "\\d+/[0-9]{2}/[0-9]{2}";

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("input date:");
		String inputDate = scn.nextLine();
		scn.close();

		judgeInputDateFormat(inputDate);
	}

	public static void judgeInputDateFormat(String inputDate) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		if (inputDate.matches(DATE_FORMAT)) {
			try {
				dateFormat.parse(inputDate);
				System.out.println("指定した形式です。");
			} catch (ParseException e) {
				System.out.println("指定した形式ではありません");
			}
		} else {
			System.out.println("指定した形式ではありません");
		}
	}
}