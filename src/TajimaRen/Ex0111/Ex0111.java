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

		//未入力の場合
		if(str.isEmpty()) {
			System.out.println("入力してください");
			return;
		}

		String[] strArrays = str.split("");
		final String[] SEARCH_TARGETS = {"①","③","⑤","⑦","⑨"};
		boolean isPermission = true;
		int count = 1;
		for (String strArray : strArrays) {
			for (String target : SEARCH_TARGETS) {
				if(strArray.contains(target)) {
					System.out.println("許可しない文字(文字：" + target +"　" + count + "桁目)が含まれます");
					isPermission = false;
				}
			}
			count++;
		}
		if(isPermission) {
			System.out.println("許可する文字列です");
		}
	}
}
