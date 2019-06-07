package liyu.Ex0110;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args) {
		System.out.println("文字列1を入力してください");
		Scanner input1 = new Scanner(System.in);
		String str1 = input1.nextLine();

		System.out.println("文字列2を入力してください");
		Scanner input2 = new Scanner(System.in);
		String str2 = input2.nextLine();
		input1.close();
		input2.close();

		if (str1.isEmpty()||str2.isEmpty()) {
			System.out.println("エラー：文字列が検出出来ません");
		}

		else if (str1.equals(str2)) {
			System.out.println("２つの文字列は同じです" + "⇒" + str1);
		} else {
			// args is the list of guests
			String[] strArray = { str1, str2 };
			Arrays.sort(strArray);
			for (int i = 0; i < strArray.length; i++)
				System.out.println(strArray[i]);
		}

	}

}
