package TajimaRen.Ex0113;

/*キーボードから文字列を入力し、文字列内に全角数字が含まれる場合は半角数字に置換して出力す
る。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0113 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列：");

		String str = br.readLine();

		//未入力の場合
		if(str.isEmpty()) {
			System.out.println("入力してください");
			return;
		}

		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			int c = (int) sb.charAt(i);
			if (c >= 0xFF10 && c <= 0xFF19) {
				sb.setCharAt(i, (char) (c - 0xFEE0));
			}
		}
		System.out.println("結果：昨日の円相場は"+ sb + "でした。");
		return;
	}
}
