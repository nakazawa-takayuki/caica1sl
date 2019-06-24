package TajimaRen.Ex0245;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0245 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number1：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number2：");

		String str2 = br2.readLine();

		int inputNum1 = 0;
		int inputNum2 = 0;

		try {
			inputNum1 = Integer.parseInt(str1);
			inputNum2 = Integer.parseInt(str2);
		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(inputNum1 <= 0 && inputNum2 <= 0) {
			System.out.println("0と0では公約数を求められません");
			return;
		}

		//出力
		System.out.println("最大公約数 ＝" + euclid(inputNum1,inputNum2));
	}

	//最大公約数を求めるメソッド
	public static int euclid(int inputNum1,int inputNum2) {
		int tmp;
		while((tmp = inputNum1 % inputNum2) != 0) {
			inputNum1 = inputNum2;
			inputNum2 = tmp;
		}
		return inputNum2;
	}
}