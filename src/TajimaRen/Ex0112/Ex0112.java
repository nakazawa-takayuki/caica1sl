package TajimaRen.Ex0112;

/*
キーボードから文字列を入力し、
文字列内に半角カナが含まれるか判定する 。
含まれる場合は「半角カナが含まれます
」、含まれない場合は「許可する文字列です」と 出力する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0112 {

	private static final String HAS_HALF_KANA = ".*[\\uFF61-\\uFF9F]+.*";

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列：");

		String str = br.readLine();

		//未入力の場合
		if(str.isEmpty()) {
			System.out.println("入力してください");
			return;
		}

		System.out.println("この文字列"+ str + "は許可されますか。");

		if(str.matches(HAS_HALF_KANA)) {
			System.out.println("半角カナが含まれます");
		} else {
			System.out.println("許可する文字列です");
		}
	}
}