package 高藝珈.Ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {

		String[] str = { "①", "③", "⑤", "⑦", "⑨" };
		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		input.close();

		boolean isRrightString = true;

		for (int i = 0; i < str.length; i++) {
			if (str1.indexOf(str[i]) == -1) {
				continue;
			} else {
				System.out.println("許可しない文字(文字：" + str[i] + "  " + (str1.indexOf(str[i]) + 1) + "桁目)が含まれます");
				isRrightString = false;
			}
		}
		if (isRrightString) {
			System.out.println("許可する文字列です。");

		}

	}

}