package TajimaRen.Ex0116;

/*
2 つの整数値i1、i2 を入力する。
i1 が偶数であり、かつi2 が偶数の場合、「2 つの値ともに偶数です」と表示する。
i1 が奇数であり、かつi2 が偶数の場合、「i1 は奇数です。i2 は偶数です」と表示する。
i1 が偶数であり、かつi2 が奇数の場合、「i1 は偶数です。i2 は奇数です」と表示する。
i1 が奇数であり、かつi2 が奇数の場合、「2 つの値ともに奇数です」と表示する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0116 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number1：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number2：");

		String str2 = br2.readLine();

		int i1 = 0;
		int i2 = 0;

		try {
			i1 = Integer.parseInt(str1);
			i2 = Integer.parseInt(str2);

		} catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(i1 % 2 == 0 && i2 % 2 == 0) {
			System.out.println("2つの値ともに偶数です");
		}else if(i1 % 2 != 0 && i2 % 2 == 0) {
			System.out.println("i1は奇数です。i2は偶数です。");
		}else if(i1 % 2 == 0 && i2 % 2 != 0) {
			System.out.println("i1は偶数です。i2は奇数です。");
		}else if(i1 % 2 != 0 && i2 % 2 != 0) {
			System.out.println("2つの値ともに奇数です");
		}

	}
}