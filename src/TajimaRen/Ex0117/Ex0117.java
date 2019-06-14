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
	static final int PASSING_SCORE = 80;		//合格点

	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input english score：");

		String str1 = br1.readLine();

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input math score：");

		String str2 = br2.readLine();

		int eScore = 0;	//英語の点数
		int mScore = 0;	//数学の点数

		try {
			eScore = Integer.parseInt(str1);
			mScore = Integer.parseInt(str2);

		} catch(NumberFormatException ex) {
			System.out.println("点数を入力してください");
			return;
		}

		if(eScore >= PASSING_SCORE && mScore >= PASSING_SCORE) {
			System.out.println("進級");
		}else if(eScore < PASSING_SCORE && mScore >= PASSING_SCORE) {
			System.out.println("再試験");
		}else if(eScore >= PASSING_SCORE && mScore < PASSING_SCORE) {
			System.out.println("再試験");
		}else if(eScore < PASSING_SCORE  && mScore < PASSING_SCORE) {
			System.out.println("留年");
		}
	}
}