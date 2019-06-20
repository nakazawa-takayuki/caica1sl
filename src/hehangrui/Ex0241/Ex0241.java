package hehangrui.Ex0241;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * 整数値を入力し、その行数分の直角三角形を出力する.
 *
 * @author Adrian
 */
public class Ex0241 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("input number :");
			int height = scan.nextInt();
			scan.close();

			//直角三角形を出力する。
			if (height > 0) {
				for (int i = 0; i < height; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					for (int j = 0; j < height - i - 1; j++) {
						System.out.print(" ");
					}
					System.out.println();
				}
			} else {
				System.out.println("1以上の数値を入力してください。");
			}

		//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("整数以外が入力されました。");
			return;
		}

	}

}
