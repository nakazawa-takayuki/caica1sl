package kanayama.Ex0255;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 課題Ex0255<br>
 * キーボードから「月の始まりの曜日の番号」と「月末の日の数字」を入力し、カレンダーを出力する
 * <br>日曜：0  月曜：1  火曜：2  水曜 3  木曜：4  金曜：5  土曜：6
 */
public class Ex0255 {
	public static void main(String[] args){
		int inputWeekday = 0;
		int inputDay = 0;
		Scanner inp = new Scanner(System.in);
		while(true) {
			System.out.println("月の始まりの曜日を数字で入力してください：");
			try {
				inputWeekday = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("整数以外が含まれています。");
				inp.next();
				continue;
			}
			if(checkInputWeekday(inputWeekday)) {
				break;
			}
		}
		while(true) {
			System.out.println("月末の日を数字で入力してください：");
			try {
				inputDay = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("整数以外が含まれています。");
				inp.next();
				continue;
			}
			if(checkInputDay(inputDay)) {
				break;
			}
		}
		inp.close();
		outputCalendar(inputWeekday,inputDay);
	}

	/**
	 * 曜日入力値チェック
	 * @return result
	 */
	private static boolean checkInputWeekday(int inputWeekday) {
		boolean result = true;
		if(inputWeekday < 0) {
			System.out.println("マイナス値が入力されています。0～6の範囲から入力してください。");
			result = false;
		}else if(6 < inputWeekday){
			System.out.println("0～6の範囲から入力してください。");
			result = false;
		}
		return result;
	}

	/**
	 * 日付入力値チェック
	 * @return result
	 */
	private static boolean checkInputDay(int inputDay) {
		boolean result = true;
		if(inputDay < 28) {
			System.out.println("28～31の範囲から入力してください。");
			result = false;
		}else if(31 < inputDay){
			System.out.println("32日以降の日付はありません。28～31の範囲から入力してください。");
			result = false;
		}
		return result;
	}

	/**
	 * カレンダー表を作成する
	 */
	private static void outputCalendar(int inputWeekday,int endDay) {
		System.out.println("日　月　火　水　木　金　土");
		System.out.println("---------------------------");
		for(int week = 0; week < inputWeekday * 2; week++){
			System.out.print("  ");
		}
		for(int day = 1; day <= endDay; day++){
			System.out.printf("%02d  ",day);
			if((day + inputWeekday) % 7 == 0){
				System.out.println("");
			}
		}
		System.out.println();
		System.out.println("---------------------------");
	}
}
