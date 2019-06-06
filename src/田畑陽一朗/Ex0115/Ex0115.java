package 田畑陽一朗.Ex0115;

import java.util.Scanner;

/**
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0115 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("文字列:");
		String line1 = scn.nextLine();
		scn.close();
		if (line1.equals("") || line1 == null) {
			System.out.println("文字を入力してください。");
			return;
		}
		String[] resultArrays = line1.split("\\s+");
		scn.close();
		System.out.print("奇数番目:");
		for (int i = 0; i < resultArrays.length; i++)
			if (i % 2 == 0) {
				System.out.print(resultArrays[i] + " ");
			}

		System.out.println();
		System.out.print("偶数番目:");
		for (int i = 0; i < resultArrays.length; i++)
			if (i % 2 != 0) {
				System.out.print(resultArrays[i] + " ");
			}
	}
}
