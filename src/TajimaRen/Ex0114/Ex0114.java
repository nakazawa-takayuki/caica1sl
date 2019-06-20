package TajimaRen.Ex0114;

/*キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。
分解後、単語を逆順で出力する。半角空白が連続で入力された場合は無視する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0114 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列：");

		String str = br.readLine();

		//未入力の場合
		if(str.isEmpty()) {
			System.out.println("入力してください");
			return;
		}

		String[] word = str.split("\\s+");
		System.out.print("結果：");
		for (int i = word.length -1 ; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
		return;
	}
}
