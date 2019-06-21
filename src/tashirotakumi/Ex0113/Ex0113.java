package tashirotakumi.Ex0113;

import java.util.Scanner;

public class Ex0113 {
	public static void main(String[] args) {
		System.out.println("文字列：");
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine(); //キーボードからの入力
		scan = Check(scan);
		System.out.println(scan);
	}

	public static String Check(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c >= '０' && c <= '９') {
				sb.setCharAt(i, (char) (c - '０' + '0'));
			}
		}
		return sb.toString();
	}
}
