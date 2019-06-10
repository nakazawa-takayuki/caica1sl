package TajimaRen.Ex0130;

/*
 * キーボードから3 つの整数値を入力し、最大値、中央値、平均値(小数第3 位を四捨五入)を出力する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

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

		int i1 = 0;
		int i2 = 0;
		int i3 = 0;

		try {
			i1 = Integer.parseInt(str1);
			i2 = Integer.parseInt(str2);
			i3 = Integer.parseInt(str3);

		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
		}
		//最大値
		int max;
		max = i1;
		if(i2 > max)
			max = i2;
		if(i3 > max)
			max = i3;

		//中央値
		int mid = 0;

		if(i1 > i2 && i1 < i3 || i1 < i2 && i1 > i3 || i1 == i2 || i1 == i3) {
			mid = i1;
		}else if(i2 > i1 && i2 < i3 || i2 < i1 && i2 > i3 || i2 == i3) {
			mid = i2;
		}else
			mid = i3;

		//平均値
		int sum = 0;		//合計値
		int [] data = {i1,i2,i3};
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		BigDecimal bd = new BigDecimal((double)sum/(double)data.length);
		BigDecimal ave= bd.setScale(2,BigDecimal.ROUND_HALF_UP);		//小数点第３位を四捨五入

		//出力
		System.out.println("最大値 ＝" + max + "　中央値 ＝" + mid + "　平均値 ＝" + ave.doubleValue());
	}
}