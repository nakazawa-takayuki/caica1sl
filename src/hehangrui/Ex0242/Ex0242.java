package hehangrui.Ex0242;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 問題
 * 整数値を入力し、その行数分の二等辺三角形を出力する.
 *
 * @author Adrian
 */
public class Ex0242 {

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int height = 0;

		try {
			System.out.println("input number :");
			height = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合の例外処理
		} catch (InputMismatchException e) {
			System.out.println("整数以外が入力されました。");
			return;
		}

		//引数の正負を判断する。
		if (height >= 0) {
			positiveNumTriangle(height);
		} else {
			negativeNumTriangle(height);
		}
	}

	/**
	 * 入力値が0以上の場合の処理メソッド
	 * @param height
	 * @return
	 */
	public static int positiveNumTriangle(int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return height;
	}

	/**
	 * 入力値が0未満の場合の処理メソッド
	 * @param height
	 * @return
	 */
	public static int negativeNumTriangle(int height) {
		for (int i = 0; i > height; i--) {
			for (int j = 0; j > height - i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k >= i * 2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return height;
	}

}
