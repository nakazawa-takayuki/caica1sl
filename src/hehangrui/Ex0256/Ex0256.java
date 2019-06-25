package hehangrui.Ex0256;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 問題
 * キーボードから文字列を入力し、その文字列が指定した日付形式か否か出力する.
 *
 * @author Adrian
 */
public class Ex0256 {

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		System.out.println("input date : ");

		Scanner scan = new Scanner(System.in);
		String inputDate = scan.nextLine();
		scan.close();

		//文字のない場合にコメント
		if (inputDate.isEmpty()) {
			System.out.println("文字を入力してください。");
			return;
		}

		//判断結果を出力する
		if (isLegalDate(inputDate)) {
			System.out.println("指定した形式です。");
		} else {
			System.out.println("指定した形式ではありません。");
		}

	}

	/**
	 * 入力した日付の形式をチェックするメソッド
	 * @param inputDate
	 * @return
	 */
	private static boolean isLegalDate(String inputDate) {
		Pattern p = Pattern.compile("^[0-9]{4}/[0-9]{2}/[0-9]{2}$");
		Matcher m = p.matcher(inputDate);
		if (m.find() == true) {
			return true;
		} else {
			return false;
		}

	}

}
