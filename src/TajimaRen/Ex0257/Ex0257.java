package TajimaRen.Ex0257;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * キーボードから日付 を 2 つ 入力し、 大 き い 日付 か ら 小 さ い 日付 の 差 を 秒 で 出力する。
 * 日付形式 は 「 Y Y Y Y M M D D 」 と す る 。 日付 が 等 し い 場合 は ゼロ を 出力 す る 。
 * @author TajimaRen
 *
 */
public class Ex0257 {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date inputDate1;
		Date inputDate2;

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input date1：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input date2：");

		String str2 = br2.readLine();

		if(str1.length() != 10 || str2.length() != 10) {
			System.out.println("YYYY/MM/ddの形式で入力してください");
			return;
		}

		try {
			inputDate1 = sdf.parse(str1);
			inputDate2 = sdf.parse(str2);
		} catch(ParseException e) {
			System.out.println("YYYY/MM/ddの形式で入力してください");
			return;
		}

		//出力
		dateDifference(inputDate1,inputDate2);
	}

	//日付の差を計算
	public static void dateDifference(Date inputDate1,Date inputDate2) {
		long secondDiff;						//日付の差(秒単位)
		long dayDiff;							//日付の差(日単位)
		long dateFrom = 0;						//小さい日付
		long dateTo = 0;						//大きい日付
		long date1 = inputDate1.getTime();		//inputDate1のミリ秒数
		long date2 = inputDate2.getTime();		//inputDate2のミリ秒数

		//日付の大小を判定し、代入
		if(date1 < date2) {
			dateFrom = date1;
			dateTo = date2;
		}else if(date1 > date2) {
			dateFrom = date2;
			dateTo = date1;
		}

		//日付の差(秒単位)と日付の差(日単位)を計算して代入
		secondDiff = (dateTo - dateFrom) / 1000;
		dayDiff = (dateTo - dateFrom) / (1000 * 60 * 60 * 24);

		//出力
		if(dayDiff == 0){
			System.out.println("日数の差は0日です");
		}else {
			System.out.println("日数の差は" + dayDiff + "で" + secondDiff + "秒です");
		}
	}
}