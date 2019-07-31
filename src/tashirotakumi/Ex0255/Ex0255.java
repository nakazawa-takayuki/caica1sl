package tashirotakumi.Ex0255;

import java.util.Scanner;

public class Ex0255 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("月の始まりの曜日を数字で入力してください：");
		String inputStr1 = scan.nextLine();
		System.out.println("月末の日を数字で入力してください");
		String inputStr2 = scan.nextLine();
		scan.close();
		int inputWeekday = convertStringToInt(inputStr1);
		int inputMonthEnd= convertStringToInt(inputStr2);
		calendarCreation(inputWeekday, inputMonthEnd);
	}

	public static int convertStringToInt(String input) {
		int num = 0;
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			System.exit(0);
		}
		return num;
	}

	public static void calendarCreation(int inputWeekday, int inputMonthEnd) {
		boolean weekendFlag = false;
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		System.out.println("--------------------------");
		int i=1;
		while ( i < inputMonthEnd) {
			for (int j = 0; j < 7; j++) {
				if (inputWeekday > j && weekendFlag == false) {
					System.out.print("\t");
				} else {
					System.out.print(String.format("%02d", i));
					System.out.print("\t");
					i++;
				}
				if(i>inputMonthEnd) {
					System.out.println();
					System.out.println("--------------------------");
					break;
				}
			}
			System.out.println();
			weekendFlag = true;
		}

	}
}
