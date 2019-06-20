package TajimaRen.Ex0200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * キーボードから1 つの整数値n を入力し、1 からn までの和を求め、結果を出力する。
 */

public class Ex0200 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number：");

		String str = br.readLine();
		int n = 0;
		int sum = 0;

		try {
			n = Integer.parseInt(str);

		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("合計値 ＝" + sum);
		return;
	}
}
