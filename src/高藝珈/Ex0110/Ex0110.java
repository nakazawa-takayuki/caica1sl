package 高藝珈.Ex0110;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("文字列1:");
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		input.close();

		System.out.println("文字列2:");
		input = new Scanner(System.in);
		String y = input.nextLine();
		input.close();

		if (x.equals(y)) {
			System.out.println("２つの文字列は同じです" + "ー＞" + x);
		} else {
			String[] args1= { x, y };
			Arrays.sort(args1);
			for (int i = 0; i < args1.length; i++)
				System.out.println(args1[i]);
		}
	}

}
