package liyu.Ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {

		System.out.println("文字列を入力してください");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str = input.next();

		String[] regEx = { "①", "③", "⑤", "⑦", "⑨" };

		boolean isNiceString = true;
		for (int i = 0; i < regEx.length; i++) {
			if (str.indexOf(regEx[i]) == -1) {
				continue;
			} else {
				System.out.println("許可しない文字(文字：" + regEx[i] + "  " + (str.indexOf(regEx[i]) + 1) + "桁目)が含まれます");
				isNiceString = false;
			}
		}

		if (isNiceString) {
			System.out.println("許可する文字列です。");
		}
	}

}