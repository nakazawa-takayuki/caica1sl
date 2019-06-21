package tashirotakumi.Ex0235;

import java.util.Scanner;

public class Ex0235 {
	public static void main(String[] args) {
		int num = 0;
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine();
		try {
			num = Integer.parseInt(scan);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
		}
		System.out.println(" 2進数：\t" + Integer.toBinaryString(num));
		System.out.println("16進数：\t" + Integer.toHexString(num));
	}
}
