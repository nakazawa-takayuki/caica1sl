package tashirotakumi.ExAd079A;

import java.util.Scanner;

public class ExAd079A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[] inputStr;
		inputStr = scan.nextLine().toCharArray();
		scan.close();
		int sumeFlag = 0;
		for (int i = 0; i < inputStr.length-1 ; i++) {
			if (inputStr[i] == inputStr[i + 1]) {
				sumeFlag++;

			} else {
				sumeFlag = 0;
			}
			if (sumeFlag == 2) {
				System.out.println("YES");
				break;
			}

		}
	}

}
