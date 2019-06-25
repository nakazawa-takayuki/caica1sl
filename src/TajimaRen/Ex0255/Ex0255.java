package TajimaRen.Ex0255;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * キーボードから「月の始まりの曜日の番号」と「月末の日の数字」を入力し、カレンダーを出力する。
 *「月の始まりの曜日の番号」は以下の通りとする。
 * 日曜：0 月曜： 1 火曜： 2 水曜： 3 木曜： 4 金曜： 5 土曜： 6
 * @author TajimaRen
 *
 */
public class Ex0255 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("月の始まりの曜日を数字で入力してください：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("月末の日を数字で入力してください：");

		String str2 = br2.readLine();

		int monthBeginning = 0;
		int monthEnd = 0;

		try {
			monthBeginning = Integer.parseInt(str1);
			monthEnd = Integer.parseInt(str2);
		} catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(monthBeginning > 6) {
			System.out.println("月の始まりの曜日の番号は0～6を入力してください");
			return;
		}

		if(monthEnd < 28 || 31 < monthEnd) {
			System.out.println("月末の日の数字は28～31を入力してください");
			return;
		}

		//カレンダー出力
		calender(monthBeginning,monthEnd);
	}

	//カレンダー作成
	public static void calender(int monthBeginning,int monthEnd) {
		int day = 0;

		System.out.println("日 月 火 水 木 金 土");
		System.out.println("---------------------");

		for(int i = 0; i < 6; i++) {		//一か月に最大6週存在する
			for(int j = 0; j < 7; j++) {	//一週間は7日ある
				if(i == 0 && j < monthBeginning) {
					System.out.print("   ");
				}else if(day < monthEnd){
					System.out.print(String.format("%02d",(day + 1)) + " ");
					day++;
				}
			}
			//最終日で改行を行わない
			if(day < monthEnd) {
				System.out.print("\n");
			}
		}

		System.out.println("\n---------------------");
	}
}
