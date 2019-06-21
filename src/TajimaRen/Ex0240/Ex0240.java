package TajimaRen.Ex0240;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2 桁の数字を入力すると、九九の表に値があるかどうか出力する。
 * @author TajimaRen
 *
 */
public class Ex0240 {

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

		if(inputNum < 10 || inputNum >= 100) {
			System.out.println("2桁の整数値を入力してください");
			return;
		}

	}
	public static void multiplication(int inputNum) {
		boolean inTable = false;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i * j == inputNum) {
					System.out.println("九九の表（" + i + "*" + j + "）にあります");
					inTable = true;
				}
			}
		}
		if(!inTable) {
			System.out.println("九九の表にありません");
		}
	}
}