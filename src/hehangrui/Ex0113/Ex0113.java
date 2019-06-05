package hehangrui.Ex0113;

import java.util.Scanner;

public class Ex0113 {

	public static void main(String[] args) {

		//キーボード入力欄
		System.out.println("文字列");

		Scanner scan = new Scanner(System.in);
		String moji = scan.nextLine();
		scan.close();

		//全角数字を半角数字に置換
		StringBuffer str = new StringBuffer(moji);
		for (int i = 0; i < moji.length(); i++) {
			char c = moji.charAt(i);
			if (c >= '０' && c <= '９') {
				str.setCharAt(i, (char) (c - '０' + '0'));
			}
		}
		System.out.println("結果：" + str);
		return;
	}
}
