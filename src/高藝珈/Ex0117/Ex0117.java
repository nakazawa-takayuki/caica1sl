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
		int e_score = 0;
		int m_score = 0;

		try {

			System.out.println("input english score：");
			e_score = input.nextInt();
			System.out.println("input math score：");
			m_score = input.nextInt();
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("数字以外が入力されています");
			return;
		}

		String val1 = e_score + "";
		String val2 = m_score + "";

		if ("".equals(val1) || "".equals(val2)) {
			System.out.println("入力されていません");
		}

		if (e_score >= 80 && m_score >= 80) {
			System.out.println("進級");
		} else if (e_score < 80 && m_score < 80) {
			System.out.println("留年");
		} else {
			System.out.println("再試験");
		}
	}
}