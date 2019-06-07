package 高藝珈.Ex0117;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*
* @author 高藝珈
*/

public class Ex0117 {

	final static int PASSING_SCORE = 80;

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

		if (eScore >= PASSING_SCORE && mScore >= PASSING_SCORE) {
			System.out.println("進級");
		} else if (eScore < PASSING_SCORE && mScore < PASSING_SCORE) {
			System.out.println("留年");
		} else {
			System.out.println("再試験");
		}
	}
}