package kanayama.Ex0256;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 課題Ex0256<br>
 * キーボードから文字列を入力し、その文字列が指定した日付形式か否か出力する。
 * 日付形式は「YYYY/MM/DD」とする。
 *
 * @author kanayama
 */
public class Ex0256 {
	public static void main(String[] args) throws ParseException{
		Scanner inp = new Scanner(System.in);
		String inputDate1 = null;

		System.out.println("input date1：");
		inputDate1 = inp.next();
		if(judgeDate(inputDate1)) {
			System.out.println("指定した日付です");
		} else {
			System.out.println("指定した形式ではありません");	
		}
		inp.close();
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

}
