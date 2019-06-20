package kanayama.Ex0117;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 金山涼香
 *英語の試験の点数 e_score 、数学の試験の点数 m_score を入力する。
 *両方の点数が80 点以上の場合、「進級」と表示する。
 *点数のどちらかが80 点を下回る場合、「再試験」と表示する。
 *両方の点数とも80 点を下回る場合、「留年」と表示する。
 */
public class Ex0117 {
	final static int PASSING_SCORE = 80;

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		try{
			System.out.print("input english score");
			int e_score = inp.nextInt();
			System.out.print("input math score");
			int m_score = inp.nextInt();

			inp.close();
			checkScore(e_score,m_score);
		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static void checkScore(int scoreEnglish,int scoreMath){
		if ((PASSING_SCORE <= scoreEnglish)&&(PASSING_SCORE <= scoreMath)){
			System.out.println("進級");
		}  else if((scoreEnglish < PASSING_SCORE)^(scoreMath < PASSING_SCORE)) {
			System.out.println("再試験");
		} else if((scoreEnglish < PASSING_SCORE)&&(scoreMath < PASSING_SCORE)) {
			System.out.println("留年");
		}
	}
}
