package 高藝珈.Ex0255;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * キーボードから「月の始まりの曜日の番号」と「月末の日の数字」を入力し、カレンダーを出力する。
 *「月の始まりの曜日の番号」は以下の通りとする。日曜：0   月曜：1   火曜：2   水曜：3   木曜：4   金曜：5   土曜：6
 *
 * @author 高藝珈
 */

public class Ex0255 {

	public static void main(String[] args) {

		int input1;
		int input2;

		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("月の始まりの曜日を数字で入力してください：");
				input1 = input.nextInt();
				System.out.println("月末の日を数字で入力してください：");
				input2 = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}
			if (input1 > 6 || input1 < 0) {
				System.out.println(" 0~6を入力してください");
				continue;
			}
			if (input2 < 28 || input2 > 31) {
				System.out.println(" 28~31を入力してください");
				continue;
			}
			input.close();
			break;
		}

		int week = 0;
		switch (input1) {
		case 0:
			week = 0;
			break;
		case 1:
			week = 1;
			break;
		case 2:
			week = 2;
			break;

		case 3:
			week = 3;
			break;
		case 4:
			week = 4;
			break;
		case 5:
			week = 5;
			break;
		default:
			week = 6;
		}

		System.out.println("--------------------------");
		System.out.print("日\t月\t火\t水\t木\t金\t土\n");

		int day = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < week) {
					System.out.print("\t");
					continue;
				}
				if (day > input2) {
					break;
				}
				System.out.printf("%02d\t", day++);
			}
			System.out.println();
		}

		System.out.println("--------------------------");
	}
}
