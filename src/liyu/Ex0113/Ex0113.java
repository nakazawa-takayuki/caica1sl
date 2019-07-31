package liyu.Ex0113;

import java.util.Scanner;

public class Ex0113 {

	public static void main(String[] args) {

		System.out.println("文字列を入力してください");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String src = input.next();

		String dbc = sbc2dbcCase(src, true);
		System.out.println("結果：" + dbc);

	}

	private static String sbc2dbcCase(String input, boolean flag) {
		String result = "";
		char[] str = input.toCharArray();
		for (int i = 0; i < str.length; i++) {

			int code = str[i];//get unicode

			if (code == 12288) {
				result += (char) (str[i] - 12256);
				return result;
			}

			if (code >= 65281 && code <= 65373)//the whole alphabet
			{
				result += (char) (str[i] - 65248);//全角to半角
			} else {
				result += str[i];
			}
		}
		return result;
	}

}