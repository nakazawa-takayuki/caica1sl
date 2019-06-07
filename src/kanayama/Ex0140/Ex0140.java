package kanayama.Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから2つの整数値とコマンドを入力し、計算結果を出力する。
 *コマンドの意味は以下の通りとする。
 *0 ：足し算
 *1 ：引き算
 *2 ：掛け算
 *その他：割り算
 */
public class Ex0140 {
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		try{
			int numArray[] = new int[3];

			System.out.print("input number1: ");
			numArray[0] = inp.nextInt();
			System.out.print("input number2: ");
			numArray[1] = inp.nextInt();
			System.out.print("input command: ");
			int calcType = inp.nextInt();
			inp.close();

			System.out.print("計算結果 =" + calcMethod(numArray,calcType));

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static int calcMethod(int[] numArray, int calcType) {
		int result = 0;
		switch(calcType) {
		case 0:
			result = numArray[0] + numArray[1];
			break;
		case 1:
			result = numArray[0] - numArray[1];
			break;
		case 2:
			result = numArray[0] * numArray[1];
			break;
		default:
			result = numArray[0] / numArray[1];
		}
		return result;
	}
}