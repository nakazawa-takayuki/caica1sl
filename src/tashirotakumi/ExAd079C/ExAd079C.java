package tashirotakumi.ExAd079C;

import java.util.Scanner;

public class ExAd079C {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		scan.close();
		String[] array = inputStr.split("");
		int fourDigits[];
		fourDigits = new int[4];
		for (int i = 0; i <= 3; i++) {
			try {
				fourDigits[i] = Integer.parseInt(array[i]);
			} catch (Exception e) {
				System.out.println("数字を入力してください");
				System.exit(0);
			}
			if(!(array.length==4)) {
				System.out.println("数字を入力してください");
				System.exit(0);
			}
		}
		System.out.println(fourDigits[0] + "-" + fourDigits[1] + "+" + fourDigits[2] + "+" + fourDigits[3] + "="
				+ (fourDigits[0] - fourDigits[1] + fourDigits[2] + fourDigits[3]));
	}
}
