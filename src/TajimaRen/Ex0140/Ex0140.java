package TajimaRen.Ex0140;

/*キーボードから2 つの整数値とコマンドを入力し、計算結果を出力する。
コマンドの意味は以下の通りとする。
0：足し算
1：引き算
2：掛け算
その他：割り算
 */

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
			return;
		}

		if(ic == 0) {
			System.out.println("計算結果 ＝" + add(i1,i2));
		}else if(ic == 1){
			System.out.println("計算結果 ＝" + subtract(i1,i2));
		}else if(ic == 2) {
			System.out.println("計算結果 ＝" + multiply(i1,i2));
		}else {
			System.out.println("計算結果 ＝" + divide(i1,i2));
		}
	}

	//足し算
	public static int add(int i1,int i2) {
		return i1 + i2;
	}

	//引き算
	public static int subtract(int i1,int i2) {
		return i1 - i2;
	}

	//掛け算
	public static int multiply(int i1,int i2) {
		return i1 * i2;
	}

	//割り算
	public static double divide(double i1,double i2) {
		try {
			double result = i1 / i2;
		}catch(ArithmeticException ex) {
			System.out.println("ゼロ除算はできません");
		}
		return i1 / i2;
	}
}
