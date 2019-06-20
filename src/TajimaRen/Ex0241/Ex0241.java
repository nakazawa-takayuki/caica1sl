package TajimaRen.Ex0241;

/**
 * 整数値を入力し、その行数分の実行例のように直角三角形を出力する。
 * @author TajimaRen
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number：");

		String str = br.readLine();
		int inputNum;

		try {
			inputNum = Integer.parseInt(str);
		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(inputNum < 2) {
			System.out.println("2以上でないと三角形ができません");
			return;
		}

		for(int i = 0; i < inputNum; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}