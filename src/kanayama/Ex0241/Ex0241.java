package kanayama.Ex0241;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 課題Ex0241<br>
 * 整数値を入力し、その行数分の直角三角形を出力する。
 */
public class Ex0241 {
	public static void main(String[] args){
		int inputNum = 0;

		Scanner inp = new Scanner(System.in);
		System.out.println("input number：");
		try {
			inputNum = inp.nextInt();
		}catch(InputMismatchException e) {
			System.out.print("整数以外が含まれています。");
			return;
		}
		inp.close();
		makeTriangle(inputNum);
	}

	/**
	 * 入力値から、その行数分の直角三角形を描画する。
	 * */
	private static void makeTriangle(int inputNum) {
		for(int column = 1; column <= inputNum; column++) {
			for(int line = 1; line <= column; line++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
