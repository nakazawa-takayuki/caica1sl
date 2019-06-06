package 高藝珈.Ex0115;

import java.util.Scanner;

/**
*
* @author 高藝珈
*/

public class Ex0115 {

	public static void main(String[] args) {

		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		input.close();

		if (input1.isEmpty()) {
			System.out.println("入力されていません");
			return;
		}

		String[] str = input1.split("\\s+");
		String Oddposition = "";
		String Evenposition = "";

		for (int index = 0; index < str.length; index++) {
			if ((index + 1) % 2 != 0) {
				Oddposition = Oddposition + str[index] + " ";
			} else {
				Evenposition = Evenposition + str[index] + " ";
			}
		}
		System.out.println("奇数番号 : " + Oddposition);
		System.out.println("偶数番号 : " + Evenposition);
		return;
	}
}
