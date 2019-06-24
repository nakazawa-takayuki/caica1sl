package 高藝珈.Ex0256;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから文字列を入力し、その文字列が指定した日付形式か否か出力する。
 * 日付形式は「YYYY/MM/DD」とする。
 *
 * @author 高藝珈
 */

public class Ex0256 {

	public static void main(String[] args) {
		String input1;

		while (true) { // 入力チェック
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("input date:");
				input1 = input.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("間違った内容が入力されています");
				continue;
			}

			if (input1.isEmpty()) {
				System.out.println("入力されていません");
				continue;
			}
			input.close();
			break;
		}

		boolean isValidDate = isValidDate(input1, true);
		if (isValidDate) {
			System.out.println("指定した形式です");
		} else {
			System.out.println("指定した形式ではありません");
		}
	}

	public static boolean isValidDate(String str, boolean flag) {

		int legalLen = 10;
		if ((str.length() != legalLen)) {
			return false;
		}

		boolean convertSuccess = true;
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		try {
			format.setLenient(false);
			format.parse(str);
		} catch (ParseException e) {
			convertSuccess = false;
		}
		return convertSuccess;
	}

}
