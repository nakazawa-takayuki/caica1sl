package tashirotakumi.Ex0112;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex0112 {

	public static void main(String[] args) {
		System.out.println("文字列：");
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine(); //キーボードからの入力
		if (!Comparison(scan)) {
			System.out.println("許可する文字列です");
		} else {
			System.out.println("半角カナが含まれます");
		}
	}

	public static boolean Comparison(String scan1) {

		char[] scan = scan1.toCharArray();
		boolean x = false;
		for (int i = 0; i < scan1.length(); i++) {
			x = Pattern.matches("^[ｦ-ﾟ]*$", String.valueOf(scan[i]));
			if (!x) {
			} else {
				return x;
			}
		}

		return x;

		//return Pattern.matches("[ｦ-ﾟ]", scan1);
	}
}