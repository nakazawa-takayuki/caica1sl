package 田畑陽一朗.Ex0114;

import java.util.Scanner;

/**
*
* キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。分解後、単語を逆順で出力する。
* 半角空白が連続で入力された場合は無視する
*
* @author田畑 陽一朗
*
*/
public class Ex0114 {

	private static Scanner scn;

	public static void main(String[] args) {

		scn = new Scanner(System.in);
		System.out.println("文字列:");
		String line1 = scn.nextLine();

		if (line1.equals("") || line1 == null) {
			System.out.println("文字を入力してください。");
			return;
		}

		String[] resultArray = line1.split("\\s+");
		for (int i = resultArray.length - 1; i >= 0; i--) {
			System.out.print(resultArray[i] + " ");
		}
	}
}