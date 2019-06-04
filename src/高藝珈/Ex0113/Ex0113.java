package Algorithm;

import java.util.Scanner;

public class Ex0113 {

	public static void main(String[] args) {

		System.out.println("文字列:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String qs = input.next();

		String rqs = Q2BChange(qs, true);
		System.out.println(qs + "\n" + rqs);

	}

	private static String Q2BChange(String input, boolean flag) {
		String result = "";
		char[] str = input.toCharArray();
		for (int i = 0; i < str.length; i++) {

			int code = str[i];//get unicode

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
