package 田畑陽一朗.Ex0117;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * 英語の試験の点数e_score 、数学の試験の点数 m_score を入力する。
 *両方の点数が80 点以上の場合、「進級」と表示する。
 *点数のどちらかが80 点を下回る場合、「再試験」と表示する。
 *両方の点数とも80 点を下回る場合、「留年」と表示する。
 *
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0117 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int eScore = 0;
		int mScore = 0;
		final int borderScore = 80;
		try {
			System.out.println("input english score:");
			eScore = scn.nextInt();
			System.out.println("input english score:");
			mScore = scn.nextInt();
			scn.close();

		} catch (InputMismatchException e) {
			System.out.println("エラーです" + e);
			return;
		} catch (NullPointerException e) {
			System.out.println("値が入っていません。");
			return;
		}

		if (eScore >= borderScore && mScore >= borderScore) {
			System.out.println("進級");

		} else if (eScore < borderScore ^ mScore < borderScore) {
			System.out.println("再試験");

		} else if (eScore < borderScore && mScore < borderScore) {
			System.out.println("留年");
		}
	}
}
