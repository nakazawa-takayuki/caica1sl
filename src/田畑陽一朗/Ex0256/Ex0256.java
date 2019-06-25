package 田畑陽一朗.Ex0256;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex0256 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("input date:");
		String inputDate = scn.nextLine();
		scn.close();

		judgeInputDateFormat(inputDate);
	}

	public static void judgeInputDateFormat(String inputDate) {

		boolean judge = true;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			dateFormat.setLenient(false);
			dateFormat.parse(inputDate);
		} catch (ParseException e) {
			judge = false;
		}
		if (judge) {
			System.out.println("指定した形式です");
		} else {
			System.out.println("指定した形式ではありません");
		}
	}
}