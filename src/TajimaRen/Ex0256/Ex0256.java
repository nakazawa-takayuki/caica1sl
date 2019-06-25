package TajimaRen.Ex0256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * キーボードから文字列 を入力し、その 文字列 が 指定 し た 日付 形式 か 否 か 出力する。
 * 日付形式 は 「 Y Y Y Y M M D D 」 と す る 。
 * @author TajimaRen
 *
 */
public class Ex0256 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input date：");

		String str = br.readLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setLenient(false);

		if(str.length() != 10) {
			System.out.println("指定した形式ではありません");
			return;
		}

		try {
			sdf.parse(str);
			System.out.println("指定した形式です");

		} catch(ParseException e) {
			System.out.println("指定した形式ではありません");
			return;
		}
	}
}