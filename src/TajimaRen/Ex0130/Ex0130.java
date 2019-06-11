package TajimaRen.Ex0130;

/*
 * キーボードから3 つの整数値を入力し、最大値、中央値、平均値(小数第3 位を四捨五入)を出力する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class Ex0130 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number1：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number2：");

		String str2 = br2.readLine();

		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number3：");

		String str3 = br3.readLine();

		//変数宣言
		Integer[] data = new Integer[3];
		int max = 0;
		int mid = 0;
		BigDecimal ave = null;

		try {
			data[0] = Integer.parseInt(str1);
			data[1] = Integer.parseInt(str2);
			data[2] = Integer.parseInt(str3);

		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		//代入
		max = maxValue(data);
		mid = midValue(data);
		ave = aveValue(data);

		//出力
		System.out.println("最大値 ＝" + max + "　中央値 ＝" + mid + "　平均値 ＝" + ave);
	}

	//最大値
	public static int maxValue(Integer [] data) {
		Arrays.sort(data,Collections.reverseOrder());
		return data[0];
	}

	//中央値
	public static int midValue(Integer [] data) {
		Arrays.sort(data);
		int mid = data.length / 2;
		if(data.length % 2 == 1) {
			return data[mid];
		}else {
			return (data[mid - 1] + data[mid]) / 2;		//偶数の場合中央値が二つあるので足して2で割る
		}
	}

	//平均値
	public static BigDecimal aveValue(Integer [] data) {
		int sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		BigDecimal bd = new BigDecimal((double)sum/(double)data.length);
		BigDecimal ave= bd.setScale(2,BigDecimal.ROUND_HALF_UP);		//小数点第３位を四捨五入

		return ave;
	}
}