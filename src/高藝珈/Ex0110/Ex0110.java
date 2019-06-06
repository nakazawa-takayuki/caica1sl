package 高藝珈.Ex0110;

import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author 高藝珈
*/

public class Ex0110 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("文字列1:");
		String input1 = input.nextLine();

		System.out.println("文字列2:");
		String input2 = input.nextLine();
		input.close();

		if (input1.isEmpty() || input2.isEmpty()) {
			System.out.println("入力されていません");
		} else if (input1.equals(input2)) {
			System.out.println("２つの文字列は同じです" + "ー＞" + input1);
		} else {
			String[] args1 = { input1, input2 };
			Arrays.sort(args1);
			for (int i = 0; i < args1.length; i++)
				System.out.println(args1[i]);
		}
	}

}
