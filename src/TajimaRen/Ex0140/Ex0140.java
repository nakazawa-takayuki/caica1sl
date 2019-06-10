package TajimaRen.Ex0140;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0140 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number1：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number2：");

		String str2 = br2.readLine();

		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input command：");

		String str3 = br3.readLine();

		int i1 = 0;
		int i2 = 0;
		int ic = 0;

		try {
			i1 = Integer.parseInt(str1);
			i2 = Integer.parseInt(str2);
			ic = Integer.parseInt(str3);

		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
		}

		if(ic == 0) {
			System.out.println("計算結果 ＝" + (i1 + i2));
		}else if(ic == 1){
			System.out.println("計算結果 ＝" + (i1 - i2));
		}else if(ic == 2) {
			System.out.println("計算結果 ＝" + (i1 * i2));
		}else {
			System.out.println("計算結果 ＝" + (i1 / i2));
		}
	}
}
