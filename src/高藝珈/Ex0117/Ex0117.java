package 高藝珈.Ex0117;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*
* @author 高藝珈
*/

public class Ex0117 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int eScore = 0;
		int mScore = 0;

		try {
			System.out.println("input english score：");
			eScore = input.nextInt();
			System.out.println("input math score：");
			mScore = input.nextInt();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		String val1 = eScore + "";
		String val2 = mScore + "";

		if ("".equals(val1) || "".equals(val2)) {
			System.out.println("入力されていません");
		}

		final int PASSING_SCORE = 80;
		if (eScore >= PASSING_SCORE && mScore >= PASSING_SCORE) {
			System.out.println("進級");
		} else if (eScore < PASSING_SCORE && mScore < PASSING_SCORE) {
			System.out.println("留年");
		} else {
			System.out.println("再試験");
		}
	}
}