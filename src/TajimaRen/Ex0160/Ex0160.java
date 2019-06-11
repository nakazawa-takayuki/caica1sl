package TajimaRen.Ex0160;

/*キーボードから入力された0~5 の範囲の2 つの数字を元に、占いの結果を出力する。
占いの結果は以下のルールに従う。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0160 {

	static final String DIVINATION [][] = {
			{"吉","吉","凶","凶","凶","吉"},
			{"吉","吉","凶","吉","凶","吉"},
			{"凶","凶","吉","吉","吉","吉"},
			{"凶","吉","吉","吉","凶","凶"},
			{"凶","凶","凶","吉","吉","凶"},
			{"凶","吉","吉","凶","凶","凶"}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("１つ目の数字（0～5）：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("２つ目の数字（0～5）：");

		String str2 = br2.readLine();

		int number1 = 0;
		int number2 = 0;

		try {
			number1 = Integer.parseInt(str1);
			number2 = Integer.parseInt(str2);

		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		for(int i = 0; i <= number1; i++);{
			for(int j = 0; j <= number2; j++);{
				if(number1 > 5 || number2 > 5 || number1 < 0 || number2 < 0) {
					System.out.println("0～5を入力してください");
				}else {
					System.out.println(DIVINATION[number1][number2]);
				}
			}
		}
	}
}
