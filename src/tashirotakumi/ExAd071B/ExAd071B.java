package tashirotakumi.ExAd071B;

import java.util.Scanner;

public class ExAd071B {

	public static final int UPPER_LIMIT = 100000;
	public static final int LOWER_LIMIT = 1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		scan.close();

		char[] defaultEng = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'i',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		char[] inputEng = inputStr.replaceAll("[^a-z]", "").toLowerCase().toCharArray();

		boolean availabilityFlag = false;

		if (inputStr.length() > UPPER_LIMIT || inputStr.length() < LOWER_LIMIT) {
			System.out.println("入力エラー");
			System.exit(0);
		}

		for (int i = 0; i < defaultEng.length; i++) {
			for (int j = 0; j < inputEng.length; j++) {

				if ((defaultEng[i] == inputEng[j])) {
					availabilityFlag = true;
				}
			}

			if (!availabilityFlag) {
				System.out.println(defaultEng[i]);
				System.exit(0);
			}

			availabilityFlag = false;
		}

		System.out.println("None");

	}
}
