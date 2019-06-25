package kanayama.Ex0257;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 課題Ex0257<br>
 * キーボードから日付を2つ入力し、大きい日付から小さい日付の差を秒で出力する。
 * 日付形式は「YYYY/MM/DD」とする。日付が等しい場合はゼロを出力する。
 *
 * @author kanayama
 */
public class Ex0257 {
	public static void main(String[] args) throws ParseException{
		Scanner inp = new Scanner(System.in);
		String inputDate1 = null;
		String inputDate2 = null;

		System.out.println("input date1：");
		inputDate1 = inp.next();
		if(!judgeDate(inputDate1)) {
			System.out.println("指定した形式ではありません");
			return;
		}
		System.out.println("input date2：");
		inputDate2 = inp.next();
		if(!judgeDate(inputDate2)) {
			System.out.println("指定した形式ではありません");
			return;
		}
		inp.close();
		if(inputDate1.compareTo(inputDate2) == -1) {
			dateDiff(inputDate1,inputDate2);
		} else {
			dateDiff(inputDate2,inputDate1);
		}
	}
	/**
	 * 日付形式チェック
	 */
	public static boolean judgeDate(String inputDate) {
		if(inputDate.length() != 10) {
			return false;
		}
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			sdf.setLenient(false);
			sdf.parse(inputDate);
			return true;

		}catch(Exception ex){
			return false;
		}
	}

	/**
	 * 日付の差分を計算する
	 * @return
	 */
	public static void dateDiff(String inputDateFrom, String inputDateTo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date dateFrom = null;
		Date dateTo = null;

		//Date型に変換
		try {
			dateFrom = sdf.parse(inputDateFrom);
			dateTo = sdf.parse(inputDateTo);
		} catch (ParseException e) {
			System.out.println( "指定した形式ではありません");
			return;
		}

		long dateTimeTo = dateTo.getTime();
		long dateTimeFrom = dateFrom.getTime();

		// 差分の日数・秒数を算出
		int MILLIS_DAY = 1000 * 60 * 60 * 24;
		long dayDiff = ( dateTimeTo - dateTimeFrom ) /  MILLIS_DAY;//日数
		long daySecondDiff = ( dateTimeTo - dateTimeFrom ) / 1000;//秒数
		System.out.print( "日数の差は" + dayDiff + "日");
		if( dayDiff == 0) {
			System.out.print( "です");
		} else {
			System.out.print( "で" + daySecondDiff + "秒です");
		}
	}
}
