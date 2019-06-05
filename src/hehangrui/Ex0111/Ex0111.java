package hehangrui.Ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {

		//配列の宣言
		String[] str = { "①", "③", "⑤", "⑦", "⑨" };

		//キーボード入力欄
		System.out.println("文字列");

		Scanner scan = new Scanner(System.in);
		String moji = scan.nextLine();
		scan.close();

		//指定の文字が含まれるか判定
		boolean isNiceString = true;
		for (String number : str) {
			if (moji.indexOf(number) == -1) {
				continue;
			} else {
				System.out.println("許可しない文字(文字：" + number + "  " + (moji.indexOf(number) + 1) + "桁目)が含まれます");
				isNiceString = false;
			}
		}
		if (isNiceString) {
			System.out.println("許可する文字列です。");
		}
	}

}
