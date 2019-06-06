package 高藝珈.Ex0111;

import java.util.Scanner;

/**
*
* @author 高藝珈
*/

public class Ex0111 {

	public static void main(String[] args) {

		final String[] PROHIBITED_CHARACTERS = { "①", "③", "⑤", "⑦", "⑨" };
		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String input1 = input.nextLine();
		input.close();

		if (input1.isEmpty()) {
			System.out.println("入力されていません");
			return;
		}

		boolean permission = true;
		int count = 1;
		String[] targetChars = input1.split("");
		System.out.println("この文字列" + input1 + "は許可されますか\n");
		for (String targetChar : targetChars) {
			for (String str : PROHIBITED_CHARACTERS) {
				if (targetChar.contains(str)) {
					System.out.println("許可しない文字(文字：" + str + "  " + count + "桁目)が含まれます");
					permission = false;
				}
			}
			count++;
		}
		if (permission) {
			System.out.println("許可する文字列です。");
		}
	}

}