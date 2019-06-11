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

		int inputNum1 = 0;
		int inputNum2 = 0;
		int inputCommand = 0;

		try {
			inputNum1 = Integer.parseInt(str1);
			inputNum2 = Integer.parseInt(str2);
			inputCommand = Integer.parseInt(str3);

		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(inputCommand == 0) {
			System.out.println("計算結果 ＝" + add(inputNum1,inputNum2));
		}else if(inputCommand == 1){
			System.out.println("計算結果 ＝" + subtract(inputNum1,inputNum2));
		}else if(inputCommand == 2) {
			System.out.println("計算結果 ＝" + multiply(inputNum1,inputNum2));
		}else {
			System.out.println("計算結果 ＝" + divide(inputNum1,inputNum2));
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
	public static Object divide(double i1,double i2) {
		return i1 / i2;
	}
}
