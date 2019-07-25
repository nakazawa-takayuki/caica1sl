package tashirotakumi.ExAd079A;

import java.util.Scanner;

public class ExAd079B {
	public static final int N_MIN = 1;

	public static final int N_MAX = 86;

	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		String inputStr = scan.nextLine();
		scan.close();
		int inputNumber=inputNumCheck(inputStr,N_MAX,N_MIN);

		long []LucasNumbers = null;
		LucasNumbers=new long [N_MAX+1];

		LucasNumbers[0]=2;
		LucasNumbers[1]=1;
		for(int i=2;i<=inputNumber;i++) {
			LucasNumbers[i]=LucasNumbers[i-2]+LucasNumbers[i-1];

		}
		System.out.println(LucasNumbers[inputNumber]);

	}
	public static int inputNumCheck(String inputNumber, int upperLimit, int lowerLimit) {
		int number = 0;
		try {
			number = Integer.parseInt(inputNumber);
		} catch (NumberFormatException e) {
			System.err.println("入力エラー");
			System.exit(0);
		}
		if (number >= lowerLimit && number <= upperLimit) {

			return number;
		}
		System.out.println("入力エラー");
		System.exit(0);
		return 0;
	}
}


