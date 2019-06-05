package TajimaRen.Ex0111;

/*
キーボードから文字列を入力し、
文字列内に「① ③ ⑤ ⑦ ⑨」が含まれるか判定する 。
含まれる場合は「許可しない文字
文字： XX YY 桁目 が含まれます」、
含まれない場合は「許可する文字列です」と
出力する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex0111 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列：");

		String str = br.readLine();
		String message = "この文字列"+ str + "は許可されますか。";
		System.out.println(message);

		String[] serchTargets = {"①","③","⑤","⑦","⑨"};
		for (String s : serchTargets) {
			if(str.contains(s)) {
				System.out.println("許可しない文字(文字：" + s +"　" + (message.indexOf(s)+1) + "桁目)が含まれます");
				return;
			}
		}
		System.out.println("許可する文字列です");
	}
}
