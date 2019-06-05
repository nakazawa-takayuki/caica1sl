package 高藝珈.Ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {

		String[] str = { "①", "③", "⑤", "⑦", "⑨" };
		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		input.close();

		boolean isRrightString = true;

		for (String name : str) {
			if (str1.indexOf(name) == -1) {
				continue;
			} else {
				System.out.println("許可しない文字(文字：" + name + "  " +  (str1.indexOf(name) + 1) + "桁目)が含まれます");
				isRrightString = false;
			}
		}
		if (isRrightString) {
			System.out.println("許可する文字列です。");

		}

	}

}