package TajimaRen.Ex0115;

/*
キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。
分解後、単語の出力順序が偶数と奇数でそれぞれ結合して出力する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0115 {

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

		System.out.print("奇数番目：");
		for (int i = 0; i < word.length; i++) {
			if((i+1) % 2 != 0) {
				System.out.print(word[i] + " ");
			}
		}
		System.out.print("\n偶数番目：");
		for (int i = 0; i < word.length; i++) {
			if((i+1) % 2 == 0) {
				System.out.print(word[i] + " ");
			}
		}
	}
}
