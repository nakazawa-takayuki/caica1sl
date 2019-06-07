package hehangrui.Ex0117;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Adrian
 *
 *問題
 *英語の試験の点数e_score、数学の試験の点数m_scoreを入力する。
 *両方の点数が80点以上の場合、「進級」と表示する。
 *点数のどちらかが80点を下回る場合、「再試験」と表示する。
 *両方の点数とも80点を下回る場合、「留年」と表示する。
 */

public class Ex0117 {

	public static void main(String[] args) {

		//キーボード入力欄
		Scanner scan = new Scanner(System.in);

		int e_score = 0;
		int m_score = 0;

		try {
			System.out.println("input english score：");
			e_score = scan.nextInt();

			System.out.println("input math score：");
			m_score = scan.nextInt();
			scan.close();

			//入力値は数字ではない場合に例外処理
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました。");
			return;
		}

		//進級か再試験か留年か判定
		if (e_score >= 80 && m_score >= 80) {
			System.out.println("進級");
		} else if (e_score < 80 && m_score < 80) {
			System.out.println("留年");
		} else if (e_score < 80 || m_score < 80) {
			System.out.println("再試験");
		}
	}
}