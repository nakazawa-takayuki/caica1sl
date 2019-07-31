package tashirotakumi.Ex0235;

import java.util.Scanner;

public class Ex0235 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		System.out.println("input number:");
		String inputStr = scan.nextLine();
		scan.close();
		try {
			num = Integer.parseInt(inputStr);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		System.out.println(" 2進数：\t" + Integer.toBinaryString(num));
		System.out.println("16進数：\t" + Integer.toHexString(num));
	}
}
