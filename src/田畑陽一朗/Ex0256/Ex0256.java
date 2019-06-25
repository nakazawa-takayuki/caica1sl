package 田畑陽一朗.Ex0256;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * キーボードから文字列を入力し、その文字列が指定した日付形式か否か出力する。
 * 日付形式は「YYYYMMDD」とする。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0256 {

	public static void main(String[] args) {

		String inputDate;

		Scanner scn = new Scanner(System.in);
		System.out.println("input date:");
		inputDate = scn.nextLine();
		scn.close();

		boolean isValidDate = isValidDate(inputDate, true);
		if (isValidDate) {
			System.out.println("指定した形式です");
		} else {
			System.out.println("指定した形式ではありません");
		}
	}

	public static boolean isValidDate(String inputDate, boolean flag) {

		boolean convertSuccess = true;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/ss/ss");
		try {
			format.parse(inputDate);
		} catch (ParseException e) {
			convertSuccess = false;
		}
		return convertSuccess;
	}
}
