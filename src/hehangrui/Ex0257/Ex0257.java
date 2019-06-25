package hehangrui.Ex0257;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 問題
 * キーボードから日付を2つ入力し、大きい日付から小さい日付の差を秒で出力する.
 *
 * @author Adrian
 */
public class Ex0257 {

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		System.out.println("input date1 : ");
		String inputDate1 = scan.nextLine();

		System.out.println("input date2 : ");
		String inputDate2 = scan.nextLine();
		scan.close();

		//文字のない場合にコメント
		if (inputDate1.isEmpty() || inputDate2.isEmpty()) {
			System.out.println("文字を入力してください。");
			return;
		}

		//判断結果を出力する
		if (isLegalDate(inputDate1, inputDate2) && twoDates(inputDate1, inputDate2) == 0) {
			System.out.println("日数の差は0日です");
		} else if (isLegalDate(inputDate1, inputDate2)) {
			System.out.println("日数の差は" + twoDates(inputDate1, inputDate2) + "日で" + twoDates(inputDate1, inputDate2) * 86400 + "秒です");
		} else {
			System.out.println("指定した形式ではありません。");
		}

	}

	/**
	 * 入力した日付の形式をチェックするメソッド
	 * @param inputDate1
	 * @param inputDate2
	 * @return
	 */
	public static boolean isLegalDate(String inputDate1, String inputDate2) {
		Pattern p = Pattern.compile("^[0-9]{4}/[0-9]{2}/[0-9]{2}$");
		Matcher m1 = p.matcher(inputDate1);
		Matcher m2 = p.matcher(inputDate2);
		if (m1.find() == true && m2.find() == true) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 二つの日付の差を計算するメソッド
	 * @param inputDate1
	 * @param inputDate2
	 * @return
	 */
	public static int twoDates(String inputDate1, String inputDate2) {

		try {
			Date formatDate1 = DateFormat.getDateInstance().parse(inputDate1);
			Date formatDate2 = DateFormat.getDateInstance().parse(inputDate2);

			long datetime1 = formatDate1.getTime();
			long datetime2 = formatDate2.getTime();

			long oneDateTime = 1000 * 60 * 60 * 24;
			long differenceDays = Math.abs((datetime1 - datetime2) / oneDateTime);
			return (int) differenceDays;
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return 0;

	}

}
