package TajimaRen.Ex0117;

/*
英語の試験の点数e_score、数学の試験の点数m_score を入力する。
両方の点数が80 点以上の場合、「進級」と表示する。
点数のどちらかが80 点を下回る場合、「再試験」と表示する。
両方の点数とも80 点を下回る場合、「留年」と表示する。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0117 {

	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input english score：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input math score：");

		String str2 = br2.readLine();

		int e_score = 0;
		int m_score = 0;
		final int PASSING_SCORE = 80;

		try {
			e_score = Integer.parseInt(str1);
			m_score = Integer.parseInt(str2);

		} catch(NumberFormatException ex) {
			System.out.println("点数を入力してください");
			return;
		}

		if(e_score >= 80 && m_score >= PASSING_SCORE) {
			System.out.println("進級");
		}else if(e_score < 80 && m_score >= PASSING_SCORE) {
			System.out.println("再試験");
		}else if(e_score >= 80 && m_score < PASSING_SCORE) {
			System.out.println("再試験");
		}else if(e_score < 80  && m_score < PASSING_SCORE) {
			System.out.println("留年");
		}

	}
}